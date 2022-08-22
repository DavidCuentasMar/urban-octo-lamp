import java.util.ArrayList;

abstract class GeneralPlatformEvents{

    protected Enum<PlatformEventsType> platformType;
    protected ArrayList<CustomEvent> platformEventsList; 

    public ArrayList<CustomEvent> getPlatformEventsList() {
        return platformEventsList;
    }

    public Enum<PlatformEventsType> getPlatformType() {
        return platformType;
    }

    public GeneralPlatformEvents(Enum<PlatformEventsType> platformType, ArrayList<CustomEvent> platformEventsList) {
        this.platformType = platformType;
        this.platformEventsList = platformEventsList;
    }

    public ArrayList<CustomEvent> matchPlatformEventData(Enum<PlatformEventsType> platformEventType, ArrayList<CustomEvent> platformEventsList){
        ArrayList<CustomEvent> platformEventsToProcess = new ArrayList<CustomEvent>();
        if(platformEventsList == null || platformEventsList.isEmpty()){
            return platformEventsToProcess;
        }

        for (CustomEvent customEvent : platformEventsList) {
            if(customEvent.platformEventType == platformEventType){
                platformEventsToProcess.add(customEvent);
            }
        }
        return platformEventsToProcess;

    }

    public void matchPlatformEventData(ArrayList<CustomEvent> platformEventsListToProcess){
        ArrayList<CustomEvent> newPlatformEventsList = matchPlatformEventData(getPlatformType(), platformEventsListToProcess);
        this.platformEventsList = newPlatformEventsList;
    }

}