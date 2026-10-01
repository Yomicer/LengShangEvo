package io.Yomicer.LengShangTech.machines;

import io.github.thebusybiscuit.slimefun4.api.geo.GEOResource;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.inventory.ItemStack;
import org.bukkit.NamespacedKey;

/**
 * 冷殇 GEO 资源 (geo_resources.yml): 莓糖星酱 / 箔澜沙 / 陨土碑。
 * supply 按环境表配置, RSC 里 nether/ end 专属资源只在该环境出产。
 */
public class LSTGeoResource implements GEOResource {

    private final NamespacedKey key;
    private final String name;
    private final ItemStack item;
    private final int overworldSupply;
    private final int netherSupply;
    private final int endSupply;
    private final int maxDeviation;
    private final boolean obtainableFromGeoMiner;

    public LSTGeoResource(NamespacedKey key, String name, ItemStack item,
                          int overworldSupply, int netherSupply, int endSupply,
                          int maxDeviation, boolean obtainableFromGeoMiner) {
        this.key = key;
        this.name = name;
        this.item = item;
        this.overworldSupply = overworldSupply;
        this.netherSupply = netherSupply;
        this.endSupply = endSupply;
        this.maxDeviation = maxDeviation;
        this.obtainableFromGeoMiner = obtainableFromGeoMiner;
    }

    @Override
    public int getDefaultSupply(World.Environment environment, Biome biome) {
        return switch (environment) {
            case NETHER -> netherSupply;
            case THE_END -> endSupply;
            default -> overworldSupply;
        };
    }

    @Override
    public int getMaxDeviation() {
        return maxDeviation;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ItemStack getItem() {
        return item.clone();
    }

    @Override
    public boolean isObtainableFromGEOMiner() {
        return obtainableFromGeoMiner;
    }

    @Override
    public NamespacedKey getKey() {
        return key;
    }
}
