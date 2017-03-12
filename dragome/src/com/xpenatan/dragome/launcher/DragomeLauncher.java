package com.xpenatan.dragome.launcher;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.dragome.DragomeApplication;
import com.badlogic.gdx.backends.dragome.DragomeApplicationConfiguration;
import com.badlogic.gdx.backends.dragome.DragomeWindow;
import com.badlogic.gdx.backends.dragome.preloader.AssetDownloader.AssetLoaderListener;
import com.badlogic.gdx.backends.dragome.preloader.AssetType;
import com.dragome.web.annotations.PageAlias;
import de.swagner.paxbritannica.PaxBritannica;


@PageAlias(alias= "pax")
public class DragomeLauncher extends DragomeApplication
{

	@Override
	public ApplicationListener createApplicationListener()
	{
		AssetLoaderListener listener = new AssetLoaderListener<Object>();

		getPreloader().loadAsset("data/audio/music.mp3", AssetType.Audio, null, listener);
		getPreloader().loadAsset("data/components/collision.lua", AssetType.Text, null, listener);
		getPreloader().loadAsset("data/components/constants.lua", AssetType.Text, null, listener);
		getPreloader().loadAsset("data/components/debug_keys.lua", AssetType.Text, null, listener);
		getPreloader().loadAsset("data/components/fast_forward.lua", AssetType.Text, null, listener);
		getPreloader().loadAsset("data/components/log.lua", AssetType.Text, null, listener);
		getPreloader().loadAsset("data/components/particles.lua", AssetType.Text, null, listener);
		getPreloader().loadAsset("data/components/resources.lua", AssetType.Text, null, listener);
		getPreloader().loadAsset("data/components/targeting.lua", AssetType.Text, null, listener);
		getPreloader().loadAsset("data/components/the_one_button.lua", AssetType.Text, null, listener);
		getPreloader().loadAsset("data/components/tracing.lua", AssetType.Text, null, listener);

		getPreloader().loadAsset("data/gui/uiskin.png", AssetType.Image, null, listener);
		getPreloader().loadAsset("data/gui/uiskin.xml", AssetType.Text, null, listener);

		getPreloader().loadAsset("data/media/abutton.xcf", AssetType.Binary, null, listener);
		getPreloader().loadAsset("data/media/abuttonsmall.xcf", AssetType.Binary, null, listener);
		getPreloader().loadAsset("data/media/bubble.xcf", AssetType.Binary, null, listener);
		getPreloader().loadAsset("data/media/credits.xcf", AssetType.Binary, null, listener);
		getPreloader().loadAsset("data/media/explosion.xcf", AssetType.Binary, null, listener);
		getPreloader().loadAsset("data/media/spark.xcf", AssetType.Binary, null, listener);

		getPreloader().loadAsset("data/scripts/background_fx.lua", AssetType.Text, null, listener);
		getPreloader().loadAsset("data/scripts/bomber_ai.lua", AssetType.Text, null, listener);
		getPreloader().loadAsset("data/scripts/bomber_shooting.lua", AssetType.Text, null, listener);
		getPreloader().loadAsset("data/scripts/bullet.lua", AssetType.Text, null, listener);
		getPreloader().loadAsset("data/scripts/collision.lua", AssetType.Text, null, listener);
		getPreloader().loadAsset("data/scripts/countdown.lua", AssetType.Text, null, listener);
		getPreloader().loadAsset("data/scripts/debris.lua", AssetType.Text, null, listener);
		getPreloader().loadAsset("data/scripts/easy_enemy_production.lua", AssetType.Text, null, listener);
		getPreloader().loadAsset("data/scripts/factory_ai.lua", AssetType.Text, null, listener);
		getPreloader().loadAsset("data/scripts/factory_damage.lua", AssetType.Text, null, listener);
		getPreloader().loadAsset("data/scripts/fade.lua", AssetType.Text, null, listener);
		getPreloader().loadAsset("data/scripts/fighter_ai.lua", AssetType.Text, null, listener);
		getPreloader().loadAsset("data/scripts/fighter_shooting.lua", AssetType.Text, null, listener);
		getPreloader().loadAsset("data/scripts/fish.lua", AssetType.Text, null, listener);
		getPreloader().loadAsset("data/scripts/frigate_ai.lua", AssetType.Text, null, listener);
		getPreloader().loadAsset("data/scripts/frigate_shooting.lua", AssetType.Text, null, listener);
		getPreloader().loadAsset("data/scripts/game_flow.lua", AssetType.Text, null, listener);
		getPreloader().loadAsset("data/scripts/heatseeking_ai.lua", AssetType.Text, null, listener);
		getPreloader().loadAsset("data/scripts/load_music.lua", AssetType.Text, null, listener);
		getPreloader().loadAsset("data/scripts/player_production.lua", AssetType.Text, null, listener);
		getPreloader().loadAsset("data/scripts/production.lua", AssetType.Text, null, listener);
		getPreloader().loadAsset("data/scripts/resources.lua", AssetType.Text, null, listener);
		getPreloader().loadAsset("data/scripts/selector.lua", AssetType.Text, null, listener);
		getPreloader().loadAsset("data/scripts/ship.lua", AssetType.Text, null, listener);
		getPreloader().loadAsset("data/scripts/splash.lua", AssetType.Text, null, listener);

		getPreloader().loadAsset("data/spritepack/credits.png", AssetType.Image, null, listener);
		getPreloader().loadAsset("data/spritepack/singleSprites1.png", AssetType.Image, null, listener);
		getPreloader().loadAsset("data/spritepack/sprites1.png", AssetType.Image, null, listener);
		getPreloader().loadAsset("data/spritepack/sprites2.png", AssetType.Image, null, listener);
		getPreloader().loadAsset("data/spritepack/title.png", AssetType.Image, null, listener);
		getPreloader().loadAsset("data/spritepack/pack.pack", AssetType.Text, null, listener);
		getPreloader().loadAsset("data/spritepack/packhigh.pack", AssetType.Text, null, listener);

		getPreloader().loadAsset("data/default.fnt", AssetType.Text, null, listener);
		getPreloader().loadAsset("data/default_00.png", AssetType.Image, null, listener);
		getPreloader().loadAsset("data/init.lua", AssetType.Text, null, listener);
		getPreloader().loadAsset("data/particles.c", AssetType.Text, null, listener);
		getPreloader().loadAsset("data/readme.txt", AssetType.Text, null, listener);
		getPreloader().loadAsset("data/screenshot_1.png", AssetType.Image, null, listener);
		getPreloader().loadAsset("data/screenshot_2.png", AssetType.Image, null, listener);
		getPreloader().loadAsset("data/screenshot_3.png", AssetType.Image, null, listener);
		getPreloader().loadAsset("data/the_game.lua", AssetType.Image, null, listener);
		return new PaxBritannica();
	}

	@Override
	public DragomeApplicationConfiguration getConfig()
	{
		return null;
	}

	@Override
	protected void onResize()
	{
		int clientWidth= DragomeWindow.getInnerWidth();
		int clientHeight= DragomeWindow.getInnerHeight();
		getCanvas().setWidth(clientWidth);
		getCanvas().setHeight(clientHeight);
		getCanvas().setCoordinateSpaceWidth(clientWidth);
		getCanvas().setCoordinateSpaceHeight(clientHeight);
		super.onResize();
	}
}
