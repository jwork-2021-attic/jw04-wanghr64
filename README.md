## 对`gourds`分支的理解

### `Tile<T extends Thing>`
- 有一个`T`的引用
- 有xy坐标
- 以及一堆getter、setter

### `Thing`
- 有一个`World`的引用
- 有一个`Tile`的引用
- 有xy坐标的getter
- 有`Tile`的setter
- 有常量私有`glyph`（字形）、`color`

### `Creature extends Thing`
- 添加了`moveTo`（可以在`Screen`上移动）

### `Calabash extends Creature`（葫芦娃）
- 私有排位`rank`，有公共的getter
- 字形是2
- 实现了`Comparable<Calabash>`的接口，用的是其中`rank`的`Integer`包装类的`compareTo`
- 公共的`swap`函数，其中调用了`moveTo`

### `WorldScreen extends Screen`
- 私有的`World`对象
- 私有的`Calabash`数组
- 包权限的`sortSteps`
- 构造方法中就进行了排序，并且也`pars`e了步骤到`sortSteps`里面
- 对于用户的输入，不管输入什么，都是按照`sortSteps`进行一步排序

### `Floor extends Thing`

就是个字形和颜色已经固定了的，并且没有`moveTo`（静止）的`Thing`

### `Sorter<T extends Comparable<T>>`

- 作为一个接口
- 需要的类参数是一个实现了Comparable接口的类
- 可以`load`，接受T的数组
- 可以`sort`
- 可以`getPlan`

### `BubbleSort<T extends Comparable<T>> implements Sorter<T>`

私有的`swap`，用于更新数组`a`和计划`plan`（`plan`是用`'\n'`作为分隔符）

