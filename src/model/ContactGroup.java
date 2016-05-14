package model;

/**
 * Couple of possible contact group
 * for notebook notes.
 *
 * @author Andrii Shchavinskyi
 * @version 1.0
 */
public enum ContactGroup {

    FAMILY("Family"), FRIENDS("Friends"), WORK("Work"), OTHER("Other");

    private final String groupName;

    ContactGroup(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

}
