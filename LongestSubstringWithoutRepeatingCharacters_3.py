class Solution(object):
    def lengthOfLongestSubstring(self, s):
        n = len(s)
        max_length = 0
        last_index = [0] * 128  # Mảng lưu vị trí xuất hiện cuối cùng của ký tự

        start = 0
        for end in range(n):
            current_char = s[end]
            start = max(start, last_index[ord(current_char)])
            max_length = max(max_length, end - start + 1)
            last_index[ord(current_char)] = end + 1

        return max_length

    def version2(self, s):
        char_index = {}
        start = 0
        max_length = 0

        for end, char in enumerate(s):
            if char in char_index and char_index[char] >= start:
                start = char_index[char] + 1
            char_index[char] = end
            max_length = max((max_length, end - start + 1))

        return max_length


if __name__ == "__main__":
    solution = Solution()
    print(solution.lengthOfLongestSubstring("abcabcbb"))
