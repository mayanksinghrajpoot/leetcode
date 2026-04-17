class Solution {
    public List<String> letterCombinations(String digit) {
        int digits=Integer.parseInt(digit);
        List<List<String>> list=new ArrayList<>();
        list.add(List.of("a", "b", "c"));
        list.add(List.of("d", "e", "f"));
        list.add(List.of("g", "h", "i"));
        list.add(List.of("j", "k", "l"));
        list.add(List.of("m", "n", "o"));
        list.add(List.of("p", "q", "r", "s")); 
        list.add(List.of("t", "u", "v")); 
        list.add(List.of("w", "x", "y", "z")); 

        ArrayList<String> ltr=new ArrayList<>();
        ltr.addAll(list.get(digits%10 - 2));
        digits/=10;
        while(digits>0){
            int temp=digits%10;
            digits/=10;
            ArrayList<String> tem=new ArrayList<>();
            for(String c:list.get(temp-2)){
                for(String s:ltr){
                    tem.add(c+s);
                }
            }
            ltr.clear();
            ltr.addAll(tem);
            
        }
        return ltr;

    }
}