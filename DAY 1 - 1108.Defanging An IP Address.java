class Solution {
    public String defangIPaddr(String address) {
        String op = address.replace(".","[.]");
        return op;
    }
}
