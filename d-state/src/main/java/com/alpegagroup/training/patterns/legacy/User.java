package com.alpegagroup.training.patterns.legacy;

public final class User {

    private String email;
    private State state;

    public User(String email) {
        this.email = email;
        this.state = State.PENDING;
    }

    // OC principle violation

    public void activate() {

        if (state == State.PENDING) {

            System.out.println("Activating pending user: " + this);
            state = State.REGISTERED;

        } else if (state == State.REGISTERED) {

            System.out.println("You can't activate a Registered user: " + this);

        } else if (state == State.WITHDRAW) {

            System.out.println("Activating withdraw user: " + this);
            state = State.REGISTERED;

        } else if (state == State.DELETED) {

            System.out.println("You can't activate a Deleted user: " + this);
        }
    }

    public void delete() {

        switch (state) {

            case REGISTERED:
                System.out.println("Deleting Registered user: " + this);
                state = State.REGISTERED;
                break;

            case WITHDRAW:
                System.out.println("Deleting Withdraw user: " + this);
                state = State.DELETED;
                break;

            default:
                System.out.println("You can't Delete user: " + this);
        }

    }

    @Override
    public String toString() {
        return "User [state=" + state
                + ", email=" + email + "]";
    }
}
