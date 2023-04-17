package Javaders.Javaders.day38enumsiterators;

public class EnumRunner {
    public static void main(String[] args) {

        String capitalOfIlinois = UsStatesEnum.ILLINOIS.getCapital();
        System.out.println(capitalOfIlinois);

        String abbreviationOfFlorida = UsStatesEnum.FLORIDA.getAbbreviation();
        System.out.println(abbreviationOfFlorida);

        UsStatesEnum state = UsStatesEnum.ALASKA;
        System.out.println(state);

        String stateName = UsStatesEnum.getStateNameByUsingAbbreviation("AK");
        System.out.println(stateName);

       String abbOfAlaska =  UsStatesEnum.getAbbreviationForStateName("Alaska");
        System.out.println(abbOfAlaska);

    }//main
}//class
