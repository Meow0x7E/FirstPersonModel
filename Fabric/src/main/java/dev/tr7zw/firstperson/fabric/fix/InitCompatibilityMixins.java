package dev.tr7zw.firstperson.fabric.fix;

public class InitCompatibilityMixins implements Runnable {
    @Override
    public void run() {
        System.out.println("[FirstPersonModel] Init Compatibility Mixins");
        /*if(FabricLoader.getInstance().isModLoaded("canvas")) {
            System.out.println("[FirstPersonModel] Applying Canvas renderer Mixin");
            Mixins.addConfiguration("firstperson_canvas.mixin.json");
        }*/
    }
}

