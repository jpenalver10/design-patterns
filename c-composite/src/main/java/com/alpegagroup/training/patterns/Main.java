package com.alpegagroup.training.patterns;

import com.alpegagroup.training.patterns.composite.Node;
import com.alpegagroup.training.patterns.composite.decision.Decision1;
import com.alpegagroup.training.patterns.composite.decision.Decision2;
import com.alpegagroup.training.patterns.composite.leaf.Leaf1;
import com.alpegagroup.training.patterns.composite.leaf.Leaf2;
import com.alpegagroup.training.patterns.composite.leaf.Leaf3;
import com.alpegagroup.training.patterns.composite.leaf.Leaf4;
import com.alpegagroup.training.patterns.legacy.IfElseImpl;
import com.alpegagroup.training.patterns.model.User;
import com.alpegagroup.training.patterns.service.UserService;

public class Main {

    private static final User USER = new User("alpega-user-id","email");
    private static final UserService USER_SERVICE = new UserService();

    public static void main(String[] args) {

        // dirty if-else chain
        // IfElseImpl ifElseImpl = new IfElseImpl(USER_SERVICE);
        // ifElseImpl.provisionUser(USER);

        // composite
        Node root = composeTree();
        root.execute(USER);

    }

    private static Node composeTree() {

        Node leaf1 = new Leaf1(USER_SERVICE);
        Node leaf2 = new Leaf2(USER_SERVICE, leaf1);
        Node leaf3 = new Leaf3(USER_SERVICE, leaf1);
        Node leaf4 = new Leaf4(USER_SERVICE, leaf1);

        // improvement: builder pattern to be more expressive setting the YES/NO node
        Node decision2 = new Decision2(USER_SERVICE, leaf1, leaf2);
        Node decision3 = new Decision2(USER_SERVICE, leaf3, leaf4);
        Node root = new Decision1(USER_SERVICE, decision2, decision3);

        return root;
    }

}
