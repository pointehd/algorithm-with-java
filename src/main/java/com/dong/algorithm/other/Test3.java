package com.dong.algorithm.other;

class Test3 {

    private int result;
    private int k;

    public int solution(int[] numbers, int k) {
        this.k = k;
        this.result = Integer.MAX_VALUE;
        recursiveSwap(numbers, 0, 0);
        return result == Integer.MAX_VALUE ? -1 : result;
    }

    private void recursiveSwap(int[] numbers, int index, int swapCount) {
        if (swapCount > result) {
            return;
        }
        if (index == numbers.length) {
            checkResult(numbers, swapCount);
            return;
        }

        for (int i = index; i < numbers.length; i++) {
            if (index != i) {
                swap(numbers, index, i);
                recursiveSwap(numbers, index + 1, swapCount + 1);
                swap(numbers, index, i);
            }
            recursiveSwap(numbers, index + 1, swapCount);
        }
    }

    private void checkResult(int[] numbers, int count) {
        boolean check = true;
        for (int i = 1; i < numbers.length; i++) {
            if (Math.abs(numbers[i] - numbers[i - 1]) > k) {
                check = false;
                break;
            }
        }
        if (check) {
            result = Math.min(count, result);
        }
    }

    private void swap(int[] numbers, int firstIndex, int secondIndex) {
        int tmp = numbers[firstIndex];
        numbers[firstIndex] = numbers[secondIndex];
        numbers[secondIndex] = tmp;
    }
}
