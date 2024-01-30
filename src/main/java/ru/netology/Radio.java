package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Radio {

    public int currentVolume = 50;
    public int minVolume = 0;
    public int maxVolume = 100;
    public int currentStation = 3;
    public int minStation = 0;
    public int maxStation = 10;
}


