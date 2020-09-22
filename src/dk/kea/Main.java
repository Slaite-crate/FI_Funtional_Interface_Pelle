package dk.kea;

public class Main{

    public static void main(String[] args) {
        ZeroArgument okayokayokayok = () -> true;
        System.out.println(okayokayokayok.test());

        OneArgument<Integer> okayokay = t -> t * t;
        System.out.println(okayokay.test(5));

        okayokay = t -> t + t;
        System.out.println(okayokay.test(5));

        TwoArguments<Integer, Integer> okay = (Integer t, Integer f) -> t*f;
        System.out.println(okay.test(2,2));
    }


}