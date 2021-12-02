package hyper;

// Arc Package
import arc.*;
import arc.util.*;
// Mindustry Package
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
// Hyper Processor Package
import hyper.content.*;

public class HyperProcessor extends Mod{

    public HyperProcessor(){}

    @Override
    public void loadContent(){
        new HyperBlocks().load();
    }
}
