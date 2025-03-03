package chackSolution;

public class CheckSolution {
    private String expected, roman;
    void getExpected(String expected){
        this.expected = expected;
    }
    void getRoman(String roman){
        this.roman = roman;
    }
    public void setChceckSolution(String expected, String roman){
        getExpected(expected);
        getRoman(roman);
    }

    public boolean checkSolution(){
        if(this.expected.equals(this.roman)){
            return true;
        }
        return false;
    }
}
