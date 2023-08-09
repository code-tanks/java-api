package api;

public class Command {
    public static final int NONE = 0;
    public static final int MOVE_FORWARD = 1 << 0;
    public static final int MOVE_BACKWARD = 1 << 1;
    public static final int ROTATE_TANK_CLOCKWISE = 1 << 2;
    public static final int ROTATE_TANK_COUNTER_CLOCKWISE = 1 << 3;
    public static final int FIRE = 1 << 4;
    public static final int ROTATE_GUN_CLOCKWISE = 1 << 5;
    public static final int ROTATE_GUN_COUNTER_CLOCKWISE = 1 << 6;
    public static final int ROTATE_RADAR_CLOCKWISE = 1 << 7;
    public static final int ROTATE_RADAR_COUNTER_CLOCKWISE = 1 << 8;
    public static final int LOCK_GUN = 1 << 9;
    public static final int UNLOCK_GUN = 1 << 10;
    public static final int LOCK_RADAR = 1 << 11;
    public static final int UNLOCK_RADAR = 1 << 12;
    public static final int REQUEST_INFO = 1 << 13;
    public static final int CLEAR_COMMANDS = 1 << 14;
}
