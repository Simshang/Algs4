## **算法第四版**

在IDEA下的源代码, 数据文件因为太大而没有上传, 在 [官方网站](http://introcs.cs.princeton.edu/java/data/)上下载数据文件解压到数据文件夹`algs4data`中

### **代码改进**

**解决文件重定向问题**

- 在书中是通过文件重定向的方式进行算法测试的, 在IDEA中通过以下代码进行文件重定向

```java
try {
        FileInputStream input = new FileInputStream("./algs4data/tinyT.txt");
        System.setIn(input);
} catch (FileNotFoundException e) {
        e.printStackTrace();
}
```