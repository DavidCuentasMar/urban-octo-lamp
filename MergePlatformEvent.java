import java.util.ArrayList;

public class MergePlatformEvent extends GeneralPlatformEvents implements PlatformEvents {
    
    //Constructor
    public MergePlatformEvent(){
        super(PlatformEventsType.MERGE, new ArrayList<CustomEvent>());
    }
    
    
    @Override
    public void execute(ArrayList<CustomEvent> platformEventsListToProcess) {
        super.matchPlatformEventData(platformEventsListToProcess);
        ArrayList<String> relatedUsersIdList = getRelatedUsersId();
        ArrayList<String> realtedUsersList = getRelatedUsers(relatedUsersIdList);
        setData(realtedUsersList);
    }

    private ArrayList<String> getRelatedUsersId(){
        ArrayList<String> userIdList = new ArrayList<String>();
        for (CustomEvent customEvent : platformEventsList) {
            userIdList.add(customEvent.userId);
        }
        return userIdList;
    }

    private ArrayList<String> getRelatedUsers(ArrayList<String> relatedUsersIdList){
        return relatedUsersIdList;
    }

    private void setData(ArrayList<String> realtedUsersList){
        System.out.println("[ " + getPlatformType() + " - USERS]");
        for (String userId : realtedUsersList) {
            System.out.println("    "+userId);
        }
    }

}
