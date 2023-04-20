package com.denisov.patterns.behavioral.state;

public class Developer {
    private Activity activity;

    public void changeActivity(Activity activity) {
        if(activity instanceof Codding)
            setActivity(new Codding());
        else if(activity instanceof Reading)
            setActivity(new Reading());
        else if(activity instanceof Training)
            setActivity(new Training());
        else if(activity instanceof Sleeping)
            setActivity(new Sleeping());
    }

    public String justDoIt() {
        return activity.justDoIt();
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}
