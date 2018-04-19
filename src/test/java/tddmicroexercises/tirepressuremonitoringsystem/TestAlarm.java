package tddmicroexercises.tirepressuremonitoringsystem;


import org.junit.*;

import java.util.HashMap;

import static org.junit.Assert.*;

public class TestAlarm {

    @Test
    public void goldMaster() {
        HashMap<Double, Boolean> goldData = new HashMap<>();
        goldData.put(19.048212679894178, false);
        goldData.put(17.87468281491007, false);
        goldData.put(17.422875594757066, false);
        goldData.put(17.068168245148783, false);
        goldData.put(20.71153396351284, false);
        goldData.put(18.47191840851764, false);
        goldData.put(16.697407204838292, true);
        goldData.put(16.570278791280284, true);
        goldData.put(19.378534596467084, false);
        goldData.put(16.779034251829028, true);
        goldData.put(16.300712390800154, true);
        goldData.put(16.232915406145374, true);
        goldData.put(17.57784164725667, false);
        goldData.put(16.29029330127707, true);
        goldData.put(16.955405135166224, true);
        goldData.put(16.524679900487737, true);
        goldData.put(17.078721864467234, false);
        goldData.put(16.302373580103534, true);
        goldData.put(18.158515839653965, false);
        goldData.put(16.268074334720872, true);
        goldData.put(16.645762423356885, true);
        goldData.put(17.311569787529532, false);
        goldData.put(16.074831760401892, true);
        goldData.put(19.88264209724449, false);
        goldData.put(17.15278068680641, false);
        goldData.put(16.66156036796079, true);
        goldData.put(19.62522166373025, false);
        goldData.put(16.96103342441201, true);
        goldData.put(17.011295687645546, false);
        goldData.put(16.104281318170198, true);
        goldData.put(16.243152821942243, true);
        goldData.put(16.883581171956727, true);
        goldData.put(17.695583444898826, false);
        goldData.put(21.639366984433316, true);
        goldData.put(19.238306463739075, false);
        goldData.put(16.238259805220945, true);
        goldData.put(18.069919570825572, false);
        goldData.put(20.489488818475692, false);
        goldData.put(16.006661685702838, true);
        goldData.put(20.05972937979066, false);
        goldData.put(16.530904357001653, true);
        goldData.put(17.413437112058677, false);
        goldData.put(20.68008193776746, false);
        goldData.put(16.84471610884859, true);
        goldData.put(16.31069552696745, true);
        goldData.put(17.253240370432206, false);
        goldData.put(16.34416330029932, true);
        goldData.put(16.12165702572121, true);
        goldData.put(16.058946782248455, true);
        goldData.put(16.19892148108671, true);
        goldData.put(16.27997062521055, true);
        goldData.put(16.122203607424762, true);
        goldData.put(18.43711222890002, false);
        goldData.put(17.447779477645756, false);
        goldData.put(19.82762303534315, false);
        goldData.put(20.51075871581612, false);
        goldData.put(16.02004306154617, true);
        goldData.put(17.928753301291984, false);
        goldData.put(17.21438981682671, false);
        goldData.put(16.350195145653792, true);
        goldData.put(17.50375879756705, false);
        goldData.put(18.148431317757428, false);
        goldData.put(16.454891520526218, true);
        goldData.put(18.22282588247259, false);
        goldData.put(16.156236814636443, true);
        goldData.put(17.197952101285203, false);
        goldData.put(16.445454007487367, true);
        goldData.put(16.45805893310024, true);
        goldData.put(16.095559803093174, true);
        goldData.put(16.586592785826454, true);
        goldData.put(16.84770559168034, true);
        goldData.put(18.24552481181638, false);
        goldData.put(18.971233832923176, false);
        goldData.put(17.017298149409736, false);
        goldData.put(20.363668555671367, false);
        goldData.put(18.422536056705344, false);
        goldData.put(17.0096693363838, false);
        goldData.put(16.469660488209552, true);
        goldData.put(17.47487251045088, false);
        goldData.put(16.184298457163578, true);
        goldData.put(16.122586534283446, true);
        goldData.put(16.500482070298997, true);
        goldData.put(16.082580006687714, true);
        goldData.put(17.077235455763155, false);
        goldData.put(17.112159268175287, false);
        goldData.put(17.154112532776004, false);
        goldData.put(16.422238261600775, true);
        goldData.put(18.043296022879844, false);
        goldData.put(16.16847215776335, true);
        goldData.put(16.091812897826003, true);
        goldData.put(16.170473077795332, true);
        goldData.put(18.512767282635046, false);
        goldData.put(17.0047232890797, false);
        goldData.put(16.68813036455432, true);
        goldData.put(18.19717900192056, false);
        goldData.put(19.06480882268088, false);
        goldData.put(16.83820558698061, true);
        goldData.put(16.911932131432224, true);
        goldData.put(16.308427194619366, true);
        goldData.put(16.05812525387555, true);
        Alarm alarm = new Alarm();
        SensorFake sensorFake = new SensorFake();
        alarm.sensor = sensorFake;
        for (double psiValue : goldData.keySet()) {
            sensorFake.fakePressure = psiValue;
            alarm.check();
            assertEquals(goldData.get(psiValue), alarm.isAlarmOn());
            alarm.alarmOn = false;
        }
    }
}
