// Last updated: 7/14/2026, 2:18:19 PM
class Solution {
    public char findTheDifference(String s, String t) {
        int a=0,b=0;
        for(int i=0;i<s.length();i++)
            a+=s.charAt(i);
        for(int i=0;i<t.length();i++)
            b+=t.charAt(i);
        return (char)(b-a);
    }
}