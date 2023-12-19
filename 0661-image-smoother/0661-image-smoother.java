class Solution {
    public int[][] imageSmoother(int[][] img) {
        int[][] result = new int[img.length][img[0].length];
        for(int r = 0 ; r < img.length ; r++) {
            for(int c = 0 ; c < img[0].length ; c ++) {
                int value = smooth(img, r, c);
                result[r][c] = value;
            }
        }

        return result;
    }

    int smooth(int[][] img , int r, int c) {
        int value = img[r][c];
        int count = 1;
        if(r > 0) {
            value += img[r-1][c];
            count++;
            if(c > 0) {
                value += img[r-1][c-1];
                count++;
            }
            if(c < img[0].length -1) {
                value += img[r-1][c+1];
                count++;
            }
        }

        if(r < img.length -1) {
            value += img[r+1][c];
            count++;
            if(c > 0) {
                value += img[r+1][c-1];
                count++;
            }
            if(c < img[0].length -1) {
                value += img[r+1][c+1];
                count++;
            }
        }

        if(c > 0) {
            value += img[r][c-1];
            count++;
        }
        if(c < img[0].length -1) {
            value += img[r][c+1];
            count++;
        }

        return value / count;
    }
}