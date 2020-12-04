package structural.adapter.solved;

import java.math.BigDecimal;

public class LegacyVehicleAdapterImpl implements LegacyVehicleAdapter {

    private LegacyVehicle legacyVehicle;

    public LegacyVehicleAdapterImpl(LegacyVehicle legacyVehicle) {
        this.legacyVehicle = legacyVehicle;
    }

    @Override
    public BigDecimal getSpeed() {
        return convertMPHtoKMH(legacyVehicle.getSpeed());
    }

    private BigDecimal convertMPHtoKMH(double mph) {
        return BigDecimal.valueOf(mph * 1.60934);
    }
}
