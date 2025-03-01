class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        int length = s.length();

        char[] result = new char[length];
        int result_index = 0;
        final int original_offset = numRows + (numRows - 2);
        int offset = original_offset;

        for (int line = 0; line < numRows && result_index < length; line++) {
            result[result_index++] = s.charAt(line);

            for (int index = line + offset; index < length && result_index < length;
                 index += offset) {
                result[result_index++] = s.charAt(index);

                if (original_offset - offset > 0) {
                    index += original_offset - offset;

                    if (index < length) {
                        result[result_index++] = s.charAt(index);
                    }
                }
            }

            offset -= 2;

            if (offset == 0) {
                offset = original_offset;
            }
        }

        return new String(result);
    }
    
    public String convert2(String s, int numRows) {
        StringBuilder rs = new StringBuilder();
        int space = (numRows - 1) * 2;
        for(int i = 0; i < numRows; i++) {
            int j = i;
            int x = space - i*2;
            while(j < s.length()) {
                if(x == space || x == 0) {
                    rs.append(s.charAt(j));
                    j = j + space;
                } else {
                    rs.append(s.charAt(j));
                    j = j + space;
                    if(j >= s.length()) {
                        break;
                    }
                    rs.append(s.charAt(j));
                    j += i*2;
                }
            }
        }
        return rs.toString();
    }
}