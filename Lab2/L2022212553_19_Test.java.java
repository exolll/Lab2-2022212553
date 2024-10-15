package edu.hitwh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    // 测试用例设计总体原则：采用等价类划分和边界值分析的原则。
    // 等价类划分主要考虑不同状态的细胞（活细胞和死细胞）以及不同数量的活邻居情况。
    // 边界值分析主要针对面板的边缘细胞进行测试。

    @Test
    void testGameOfLife1() {
        // 测试目的：测试一个活细胞周围活邻居小于 2 的情况。
        // 测试用例：一个活细胞，周围只有一个活邻居。
        int[][] board = {{1, 0}, {0, 0}};
        int[][] expectedBoard = {{0, 0}, {0, 0}};
        Solution solution = new Solution();
        solution.gameOfLife(board);
        assertArrayEquals(expectedBoard, board);
    }

    @Test
    void testGameOfLife2() {
        // 测试目的：测试一个活细胞周围活邻居为 2 的情况。
        // 测试用例：一个活细胞，周围有两个活邻居。
        int[][] board = {{1, 1}, {1, 0}};
        int[][] expectedBoard = {{1, 1}, {1, 1}};
        Solution solution = new Solution();
        solution.gameOfLife(board);
        assertArrayEquals(expectedBoard, board);
    }

    @Test
    void testGameOfLife3() {
        // 测试目的：测试一个活细胞周围活邻居为 3 的情况。
        // 测试用例：一个活细胞，周围有三个活邻居。
        int[][] board = {{1, 1}, {1, 0}};
        int[][] expectedBoard = {{1, 1}, {1, 1}};
        Solution solution = new Solution();
        solution.gameOfLife(board);
        assertArrayEquals(expectedBoard, board);
    }

    @Test
    void testGameOfLife4() {
        // 测试目的：测试一个活细胞周围活邻居大于 3 的情况。
        // 测试用例：一个活细胞，周围有四个活邻居。
        int[][] board = {{1, 1}, {1, 1}};
        int[][] expectedBoard = {{0, 1}, {1, 1}};
        Solution solution = new Solution();
        solution.gameOfLife(board);
        assertArrayEquals(expectedBoard, board);
    }

    @Test
    void testGameOfLife5() {
        // 测试目的：测试一个死细胞周围活邻居为 3 的情况。
        // 测试用例：一个死细胞，周围有三个活邻居。
        int[][] board = {{0, 1}, {1, 1}};
        int[][] expectedBoard = {{1, 1}, {1, 1}};
        Solution solution = new Solution();
        solution.gameOfLife(board);
        assertArrayEquals(expectedBoard, board);
    }

    @Test
    void testGameOfLife6() {
        // 测试目的：测试边界细胞的情况。
        // 测试用例：左上角的细胞为活细胞，周围有两个活邻居。
        int[][] board = {{1, 1}, {0, 0}};
        int[][] expectedBoard = {{1, 1}, {0, 0}};
        Solution solution = new Solution();
        solution.gameOfLife(board);
        assertArrayEquals(expectedBoard, board);
    }
}