import java.util.ArrayList;

public class HardDeletePlatformEvent extends GeneralPlatformEvents implements PlatformEvents {

    //Constructor
    public HardDeletePlatformEvent(){
        super(PlatformEventsType.HARD_DELETE, new ArrayList<CustomEvent>());
    }
    
    
    @Override
    public void execute(ArrayList<CustomEvent> platformEventsListToProcess) {
        super.matchPlatformEventData(platformEventsListToProcess);
        ArrayList<String> relatedUsersIdList = getRelatedUsersId();
        ArrayList<String> realtedUsersList = super.getRelatedUsers(relatedUsersIdList);
        setData(realtedUsersList);
    }

    private ArrayList<String> getRelatedUsersId(){
        ArrayList<String> userIdList = new ArrayList<String>();
        for (CustomEvent customEvent : platformEventsList) {
            userIdList.add(customEvent.userId);
        }
        return userIdList;
    }

    private void setData(ArrayList<String> realtedUsersList){
        System.out.println("[ " + getPlatformType() + " - USERS]");
        for (String userId : realtedUsersList) {
            System.out.println("    "+userId);
        }
    }

}
