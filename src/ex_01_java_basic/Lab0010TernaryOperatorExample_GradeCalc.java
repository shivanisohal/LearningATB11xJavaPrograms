package ex_01_java_basic;

public class Lab0010TernaryOperatorExample_GradeCalc {
    public static void main(String[] args) {

        int Grade=Integer.parseInt(args[0]);
        System.out.println(
                (
                    Grade>100?"Not Valid":(
                        (Grade >= 90)?"A Grade":(
                                (Grade>=80)?"B Grade":(
                                        (Grade>=70)?"C Grade":(
                                                (Grade>=60)?"D Grade":(
                                                        (Grade>=50)?"F Grade":"Fail"
                                                )
                                        )
                                )
                            )
                        )
                    )
                );
        }
    }
