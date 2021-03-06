/*
 * Copyright 2013-2014 Marc-André Dufresne
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.imatruck.betterweather.iconthemes;

import net.imatruck.betterweather.R;

public class GoogleNowIconTheme implements IIconTheme{

    @Override
    public int getConditionIcon(int conditionCode) {
        switch (conditionCode) {
            case 20: // foggy
            case 19: // dust
            case 21: // haze
                return R.drawable.googlenow_foggy;
            case 26: // cloudy
                return R.drawable.googlenow_cloudy;
            case 27: // mostly cloudy (night)
                return R.drawable.googlenow_mostly_cloudy_night;
            case 29: // partly cloudy (night)
                return R.drawable.googlenow_partly_cloudy_night;
            case 28: // mostly cloudy (day)
                return R.drawable.googlenow_mostly_cloudy;
            case 30: // partly cloudy (day)
            case 44: // partly cloudy
                return R.drawable.googlenow_partly_cloudy;
            case 31: // clear (night)
            case 33: // fair (night)
                return R.drawable.googlenow_clear_night;
            case 34: // fair (day)
            case 32: // sunny
            case 23: // blustery
            case 36: // hot
                return R.drawable.googlenow_sunny;
            case 0: // tornado
            case 1: // tropical storm
            case 2: // hurricane
            case 24: // windy
            case 22: // smoky
                return R.drawable.googlenow_windy;
            case 5: // mixed rain and snow
            case 6: // mixed rain and sleet
            case 7: // mixed snow and sleet
            case 18: // sleet
            case 8: // freezing drizzle
            case 10: // freezing rain
            case 14: // light snow showers
            case 17: // hail
            case 35: // mixed rain and hail
                return R.drawable.googlenow_mixed_rain_and_sleet;
            case 9: // drizzle
            case 11: // showers
            case 12: // showers
            case 40: // scattered showers
                return R.drawable.googlenow_rain;
            case 4: // thunderstorms
            case 37: // isolated thunderstorms
            case 45: // thundershowers
            case 47: // isolated thundershowers
            case 3: // severe thunderstorms
            case 38: // scattered thunderstorms
            case 39: // scattered thunderstorms
                return R.drawable.googlenow_storm;
            case 15: // blowing snow
            case 16: // snow
            case 25: // cold
            case 46: // snow showers
            case 13: // snow flurries
            case 42: // scattered snow showers
            case 41: // heavy snow
            case 43: // heavy snow
                return R.drawable.googlenow_snow;
        }
        return R.drawable.googlenow_unknown;
    }
}
