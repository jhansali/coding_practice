class Solution:
    def removeOuterParentheses(self, s: str) -> str:
        count=0
        string_list = list(s)
        res=[]
        for i in range (len(string_list)):
            if(string_list[i]=='('):
                if(count>0):
                    res.append(string_list[i])
                count+=1
            elif(string_list[i]==')'):
                if(count>1):
                    res.append(string_list[i])
                count-=1
            if(count<0):
                break;
        
        return "".join(res)
            
        
