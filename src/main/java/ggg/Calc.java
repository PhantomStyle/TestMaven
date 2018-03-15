package ggg;

public class Calc implements Calculator {
    @Override
    public int add(String args) throws RuntimeException{
        if(args.equals("")){
            return 0;
        }
        args = args.trim();
        String[] digits;
        if(args.toCharArray()[0] == '/' && args.toCharArray()[1] == '/') {
            char divider = args.toCharArray()[2];
            //System.out.println(divider);
            digits = args.split(String.valueOf(divider));
        }
        else {
            digits = args.split("[^0-9\\-]");
        }
        if(args.equals("")){
            return 0;
        }
        if(digits.length > 2){
            int res = 0;
            for(String digit : digits){
                if(!digit.contains("-")) {
                    res += Integer.parseInt(digit);
                }
            }
            return res;
        }
        if(digits.length == 2) {
            return Integer.parseInt(digits[0]) + Integer.parseInt(digits[1]);
        }

        if(digits.length == 1){

            return Integer.parseInt(digits[0]);

        }

        if(digits.length == 0){
            return 0;
        }

        return 0;
    }
}
