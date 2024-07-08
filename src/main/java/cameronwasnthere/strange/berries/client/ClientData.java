package cameronwasnthere.strange.berries.client;

import cameronwasnthere.strange.berries.util.PlayerData;

public class ClientData {
    private static PlayerData playerData;

    public static void setPlayerData(PlayerData data) {
        playerData = data;
    }

    public static PlayerData getPlayerData() {
        return playerData;
    }
}
