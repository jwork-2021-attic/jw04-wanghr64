import random
import cv2

matrix = [(x, y)for y in range(0, 8)for x in range(0, 8)]
random.shuffle(matrix)

img = cv2.imread("c256.png")

f = open("yousei_matrix.txt", "w")

for i in range(0, 64):
    pixel = img[53*int(i % 8), 72*int(i/8)]
    f.write(
        f"youseis[{matrix[i][0]}][{matrix[i][1]}] = new YouSei(new Color({pixel[2]}, {pixel[1]}, {pixel[0]}), {i}, world);\n")

f.close()
