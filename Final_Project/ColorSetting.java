package Final_Project;

import java.awt.*;

public enum ColorSetting {

    _0   (0,    0xcdc0b4, 0x776e65),
    _2   (2,    0x776E65, 0xEEE4DA),
    _4   (4,    0x776E65, 0xEDE0C8),
    _8   (8,    0xF9F6F2, 0xF2B179),
    _16  (16,   0xF9F6F2, 0xF59563),
    _32  (32,   0xF9F6F2, 0xF67C5F),
    _64  (64,   0xF9F6F2, 0xF65E3B),
    _128 (128,  0xF9F6F2, 0xEDCF72),
    _256 (256,  0xF9F6F2, 0xEDCC61),
    _512 (512,  0xF9F6F2, 0xEDC850),
    _1024(1024, 0xF9F6F2, 0xEDC53F),
    _2048(2048, 0xF9F6F2, 0xEDC22E);

    private final int value;
    private final Color color;
    private final Color fontColor;

    // constructor
    ColorSetting(int n, int fntc, int bgc){
        value = n;
        color = new Color(bgc);
        fontColor = new Color(fntc);
    }

    static ColorSetting of(int num){
        return ColorSetting.valueOf("_" + num);
    }

    public Color fontColor(){
        return fontColor;
    }

    public Color color(){
        return color;
    }

    public int value(){
        return value;
    }

}

