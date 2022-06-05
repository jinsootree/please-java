package 배열;

public class visitorNumbers {
    public static void main(String[] args) {
        String [] cities = {"서울", "부산", "인천", "대전", "대구"};
        int [] visitCount =  {599,51,46,43,27};


        for (int i = 0; i < cities.length; i++){ 
        System.out.printf("%s: %d명\n", cities[i], visitCount[i]);
        }
    }
}
