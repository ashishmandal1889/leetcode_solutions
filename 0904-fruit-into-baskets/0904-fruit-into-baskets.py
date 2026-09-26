class Solution:
    def totalFruit(self, fruits: list[int]) -> int:
        i = 0
        char_map = {}
        maxfruits = 0
        for j in range(len(fruits)):
            char_map[fruits[j]] = char_map.get(fruits[j],0)+1
            while len(char_map)>2:
                char_map[fruits[i]] -=1
                if char_map[fruits[i]]==0:
                   del char_map[fruits[i]]
                i +=1
            maxfruits = max(maxfruits, j-i+1)           
    
        return maxfruits    