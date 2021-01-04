package com.github.gongfuboy.leetcode.offer;

public class Offer12 {


    public boolean exist(char[][] board, String word) {

        if (word == null || word.length() == 0) {
            return false;
        }

        if (board == null || board.length == 0) {
            return false;
        }

        if (board[0] == null) {
            return false;
        }

        char[] chars = word.toCharArray();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (dfs(board, i, j , chars, 0)) {
                    return true;
                }
            }
        }


        return false;
    }

    private boolean dfs(char[][] board, int i, int j, char[] words, int indexK) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || words[indexK] != board[i][j]) return false;
        if (indexK == words.length -1) {
            return true;
        }
        board[i][j] = '\0';
        boolean result = dfs(board, i - 1, j, words, indexK + 1) || dfs(board, i, j + 1, words, indexK + 1) ||
                dfs(board, i + 1, j, words, indexK + 1) || dfs(board, i, j - 1, words, indexK + 1);

        board[i][j] = words[indexK];

        return result;

    }


}
