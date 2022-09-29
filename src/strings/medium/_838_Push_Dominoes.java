package strings.medium;

public class _838_Push_Dominoes {

    public static String pushDominoes(String dominoes) {
        char[] d = dominoes.toCharArray();
        // l is the left pointer
        int l = 0, n = dominoes.length();
        // r is the right pointer
        for (int r = 0; r < n; r++) {
            if (d[r] == '.') {
                // case 1. meeting `.`, then skip it
                continue;
            } else if ((d[r] == d[l]) || (d[l] == '.' && d[r] == 'L')) {
                // case 2. both end is equal, i.e. d[r] == d[l]
                // then fill all the dots between both end
                // e.g. L....L -> LLLLLL
                // e.g. R....R -> RRRRRR
                // case 2.1 if the left end is . and the right end is L,
                // i.e. d[l] == '.' && d[r] == 'L'
                // then we need to fill them from `l` to `r` in this case
                for (int k = l; k < r; k++) d[k] = d[r];
            } else if (d[l] == 'L' && d[r] == 'R') {
                // case 3. left end is L and right end is R
                // e.g. L.....R
                // then do nothing
            }  else if (d[l] == 'R' && d[r] == 'L') {
                // case 4. left end is R and right end is L
                // if we have odd number of dots between them (let's say m dots),
                // then we can only add (m / 2) Ls and (m / 2) Rs.
                // p.s `/` here is integer division. e.g. 3 / 2 = 1
                // e.g. R...L -> RR.LL
                // if we have even number of dots between them (let's say m dots),
                // then we can only add (m / 2) Ls and (m / 2) Rs.
                // e.g. R....L -> RRRLLL
                int m = (r - l - 1) / 2;
                for (int k = 1; k <= m; k++) {
                    d[r - k] = 'L';
                    d[l + k] = 'R';
                }
            }
            // update left pointer
            l = r;
        }
        // case 5. if the left dominoe is `R`, then fill all 'R' till the end
        // e.g. LL.R. -> LL.RR
        if (d[l] == 'R') for (int k = l; k < n; k++) d[k] = 'R';
        return new String(d);
    }

    public static void main(String[] args) {

        String dominoes = ".L.R...LR..L..";
        //LL.RR.LLRRLL..

        char[] dominoesArr = dominoes.toCharArray();

        int left = 0;
        int length = dominoes.length();


        for (int right = 0; right < length; right++) {

            if (dominoesArr[right] == '.') {
                continue;
            } else if ((dominoesArr[right] == dominoesArr[left]) ||
                dominoesArr[left] == '.' && dominoesArr[right] == 'L') {

                for (int k = left; k < right; k++) {
                    dominoesArr[k] = dominoesArr[right];
                }
            } else if (dominoesArr[left] == 'L' && dominoesArr[right] == 'R') {
                //continue;
            }else if (dominoesArr[left] == 'R' && dominoesArr[right] == 'L') {

                int mid = (right - left -1) / 2;
                for (int k = 1; k <= mid; k++) {
                    dominoesArr[right - k] = 'L';
                    dominoesArr[left+k] = 'R';
                }
            }
            left = right;
        }

        if (dominoesArr[left] == 'R') {
            for (int k = left; k < length; k++) {
                dominoesArr[k] = 'R';
            }
        }

        String answer = new String(dominoesArr);

        System.out.println(answer);

        System.out.println(pushDominoes(dominoes));


    }
}
