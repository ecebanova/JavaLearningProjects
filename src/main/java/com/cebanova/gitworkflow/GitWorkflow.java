package com.cebanova.gitworkflow;

public class GitWorkflow {
    public static void main(String[] args) {
        // Declaring a list of String variables
        String step1 = "Perform git stash - to store the uncommitted changes";
        String step2 = "Perform git pull - to fetch and download content from a remote repository and immediately " +
                "update the local repository to match that content";
        String step3 = "Perform git checkout master - to move to the local master branch";
        String step4 = "Perform git fetch command - to fetch the origin branches";
        String step5 = "Perform checkout -b new_branch_name command - to create and instantly move to a new branch," +
                "that is identical to local master branch.";
        String step6 = "Add your changes related to your task";
        String step7 = "Review your changes and check your code before committing them";
        String step8 = "Execute git commit using the IntelliJ interface, where you can select what changes you want to commit";
        String step9 = "Once all the changes are committed, execute a git push command by using CTRL+ALT+K hot keys";
        String step10 = "The committed changes are pushed to an origin branch with the same name, navigate to GitHub branch";
        String step11 = "Create a Pull Request from origin/new_branch_name into origin/master";
        String step12 = "Add the Pull Request details - name, description and request review from your colleagues";
        String step13 = "If someone requests changes, then they must be reviewed, then new commits are added " +
                "until you get at least 2 approvals from collaborators";
        String step14 = "If you collect at least 2 approvals from your colleagues the merge the branch";
        String step15 = "After then, the origin/master contains the latest changes and the origin/new_branch_name can be deleted";
        String step16 = "Do not forget that locally you are still on the new_branch_name, it's good to move back to master";
        String step17 = "However, the local master branch does not have the latest changes, therefore perform a git fetch and git pull";

        // Displaying the above variables to the console
        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);
        System.out.println(step4);
        System.out.println(step5);
        System.out.println(step6);
        System.out.println(step7);
        System.out.println(step8);
        System.out.println(step9);
        System.out.println(step10);
        System.out.println(step11);
        System.out.println(step12);
        System.out.println(step13);
        System.out.println(step14);
        System.out.println(step15);
        System.out.println(step16);
        System.out.println(step17);
    }
}
