import java.util.*;

public class Main{

    public static void main(String[] args){
        ArrayList<CustomEvent> customEventList = new ArrayList<>();
        customEventList.add(
            new CustomEvent(
                "001",
                "Random User Name # 1",
                PlatformEventsType.UPDATE
            )
        );
        customEventList.add(
            new CustomEvent(
                "002",
                "Random User Name # 2",
                PlatformEventsType.UPDATE
            )
        );
        customEventList.add(
            new CustomEvent(
                "003",
                "Random User Name # 3",
                PlatformEventsType.HARD_DELETE
            )
        );
        customEventList.add(
            new CustomEvent(
                "004",
                "Random User Name # 4",
                PlatformEventsType.MERGE
            )
        );

        new HardDeletePlatformEvent().execute(customEventList);
        new UpdatePlatformEvent().execute(customEventList);
        new MergePlatformEvent().execute(customEventList);
    }
}