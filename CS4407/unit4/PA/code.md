# code

```R
A1 <c(0, 0)
A2 <c(1, 1)
A3 <c(2, 2)

B1 <c(6, 6)
B2 <c(5.5, 7)
B3 <c(6.5, 5)

test1 <c(4, 4)
test2 <c(3.5, 3.5)

train <matrix(c(0, 0, 1, 1, 2, 2, 6, 6, 5.5, 7, 6.5, 5), ncol = 2, byrow = TRUE)
colnames(train) <c("X", "Y")
cl <factor(c("A", "A", "A", "B", "B", "B"))
```

```R
plot(train, col = cl, pch = 16, xlab = "X", ylab = "Y", main = "Plot the Chart")
legend("topleft", legend = levels(cl), col = 1:2, pch = 16)
```

```R
library(class)
test1 <matrix(c(4, 4), ncol = 2)
result_k1 <knn(train, test1, cl, k = 1)
print(result_k1)
summary(result_k1)
```

```R
test2 <matrix(c(3.5, 3.5), ncol = 2)
result_k1_test2 <knn(train, test2, cl, k = 1)
print(result_k1_test2)
summary(result_k1_test2)
```

```R
test_batch <matrix(c(4, 4, 3, 3, 5, 6, 7, 7), ncol = 2, byrow = TRUE)
result_batch <knn(train, test_batch, cl, k = 3)
print(result_batch)
summary(result_batch)
```
