// I would like to replace "dishwasher" with "galaxy" in this example, but it has a problem.
// Please fix it for me!
// Expected ouput: In a galaxy far far away
//System.out.println(example);

public class Strings_SimpleReplace {
    public static void main(String[] args) {

        String example = "In a dishwasher far far away";


        example = example.replace("dishwasher", "galaxy");
        System.out.println(example);

    }
}
