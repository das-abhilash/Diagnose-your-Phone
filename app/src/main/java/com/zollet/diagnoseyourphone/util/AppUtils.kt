package com.zollet.diagnoseyourphone.util

import android.content.Context
import android.content.Intent
import android.net.Uri
import com.zollet.diagnoseyourphone.models.AlternativeApp

object AppUtils {

    fun redirectToPlayStore(context: Context, appPackageName: String) {
        try {
            context.startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("market://details?id=$appPackageName")
                )
            )
        } catch (anfe: android.content.ActivityNotFoundException) {
            context.startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://play.google.com/store/apps/details?id=$appPackageName")
                )
            )
        }
    }

    fun getChineseAppList(): List<String> {
        val list: MutableList<String> = mutableListOf()
        list.add("app.buzz.share")
        list.add("app.buzz.share.lite")
        list.add("com.lenovo.anyshare.gps")
        list.add("shareit.lite")
        list.add("com.ushareit.watchit")
        list.add("com.zhiliao.musically.livewallpaper")
        list.add("com.zhiliaoapp.musically")
        list.add("com.kwai.video")
        list.add("com.CricChat.intl")
        list.add("com.ucturbo")
        list.add("com.uc.browser.en")
        list.add("com.UCMobile.intl")
        list.add("video.like")
        list.add("sg.bigo.live")
        list.add("sg.bigo.live.lite")
        list.add("com.ss.android.ugc.boom")
        list.add("com.ss.android.ugc.boom.livewallpaper")
        list.add("com.magicv.airbrush")
        list.add("com.commsource.beautyplus")
        list.add("com.meitu.makeup")
        list.add("com.mt.mtxx.mtxx")
        list.add("com.meitu.meiyancamera")
        list.add("com.meitu.oxygen")
        list.add("com.meitu.facefactory")
        list.add("com.meitu.wheecam")
        list.add("com.beautyplus.pomelo.filters.photo")
        list.add("com.meitu.meipaimv")
        list.add("com.meitu.beautyplusme")
        list.add("com.meitu.airvid")
        list.add("com.meitu.airbrush.vivo")
        list.add("com.meitu.mobile.meituautodyne")
        list.add("com.meitu.boxxcam")
        list.add("cn.xender")
        list.add("com.intsig.camscanner")
        list.add("com.tencent.iglite")
        list.add("com.tencent.ig")
        list.add("com.tencent.ludosuperstar")
        list.add("com.ngame.allstar.eu")
        list.add("com.tencent.godgame")
        list.add("com.hcg.cok.gp")
        list.add("com.hcg.ctw.gp")
        list.add("com.elex.coq.gp")
        list.add("com.zw.zombieworld.gp")
        list.add("com.hcg.tos.gp")
        list.add("com.mobile.legends")
        list.add("com.moonton.mobilehero")
        list.add("club.fromfactory")
        list.add("com.dc.hwsj")
        list.add("com.yottagames.stoneage")
        list.add("com.yottagames.mafiawar")
        list.add("com.game168.gameofmafia")
        list.add("com.zzkko")
        list.add("free.vpn.unblock.proxy.turbovpn")
        list.add("free.vpn.unblock.proxy.vpnmonster")
        list.add("free.vpn.unblock.proxy.turbovpn.lite")
        list.add("com.tencent.mm")
        list.add("com.domobile.applockwatcher")
        list.add("com.domobile.applock.lite")
        list.add("com.domobile.mixnote")
        list.add("com.uc.vmate")
        list.add("com.uc.vmlite")
        list.add("com.videochat.livu")
        list.add("com.newsdog")
        list.add("com.youdao.hindict")
        list.add("com.youdao.uclass")
        list.add("com.youdao.cloudpen")
        list.add("com.uc.vmate")
        list.add("com.uc.vmlite")
        list.add("com.ss.android.ugc.boom")
        list.add("com.ss.android.ugc.boom.livewallpaper")
        list.add("com.diandian.gog")
        list.add("com.funplus.kingofavalon")
        list.add("com.funplus.familyfarm")
        list.add("com.gamemaker5.idlemafia")
        list.add("com.flashkeyboardtheme")
        list.add("com.storysaverforwhatsapp.story")
        list.add("com.century.dreamdetective")
        list.add("com.funplus.familyfarmtango")
        list.add("com.storysaverforwhatsapp.Business")
        list.add("com.nono.android")
        list.add("com.nono.go")
        list.add("com.lbe.parallel.intl")
        list.add("com.lbe.parallel.intl.arm64")
        list.add("com.parallel.space.pro")
        list.add("com.parallel.space.lite")
        list.add("com.parallel.space.pro.arm64")
        list.add("com.parallel.space.lite.arm64")
        list.add("com.gamestudio.moveout")
        list.add("com.lbe.knocktower")
        list.add("com.lbe.camera.pro")
        list.add("com.parallel.space.pro.arm32")
        list.add("com.parallel.space.lite.arm32")
        list.add("com.lbe.parallel.intl.arm32")
        list.add("com.gamestudio.td")
        list.add("com.lbe.scissor")
        list.add("com.xprodev.cutcam")
        list.add("com.eg.android.AlipayGphone")
        list.add("hk.alipay.wallet")
        list.add("com.weico.international")
        list.add("com.w.video")
        list.add("com.romwe")
        list.add("com.asiainno.uplive")
        list.add("com.asiainno.uplive.upvoice")
        list.add("com.superstar.fantuan")
        list.add("com.diandian.legendofhonourea")
        list.add("com.funplus.townkins.global")
        list.add("com.century.dreamdetective")
        list.add("com.funplus.familyfarmtango")
        list.add("com.live.videochat.india")
        list.add("com.zakzak.lite.chat")
        list.add("com.zakzak.live.chat")
        list.add("com.nono.android")
        list.add("com.nono.go")
        list.add("com.lovinga")
        list.add("com.amolatina")
        list.add("com.itonline.anastasiadate")
        list.add("com.dating.android")
        list.add("com.yourtravelmates")
        list.add("com.arabiandate")
        list.add("com.flirtwith")
        list.add("com.qidian.Int.reader")
        list.add("com.webnovel.lite")
        list.add("com.webnovel.lite.book12075048706873905")
        list.add("com.webnovel.lite.book12507348206677105")
        list.add("com.qidian.QDReader.traditional")
        list.add("sg.bigo.hellotalk")
        list.add("com.gtarcade.lod")
        list.add("com.gtarcade.lhjx")
        list.add("com.gta.nslm2")
        list.add("com.gtarcade.eoa")
        list.add("com.youzu.snsgz.android.sm")
        list.add("com.gamesword.twsw")
        list.add("air.eti.uzzu.unalis")
        list.add("com.longtech.lastwars.gp")
        list.add("com.space.zero.gp")
        list.add("com.betterfun.wah.gp")
        list.add("com.lilithgame.roc.gp")
        list.add("com.lilithgame.sgame.gp.oss")
        list.add("com.lilithgame.tgames.gp")
        list.add("com.lilithgames.hgame.gp.id")
        list.add("com.lilithgame.isoland2.gp.mf")
        list.add("us.kick9.k3000000013.c3101000001")
        list.add("com.Lilith.Abi")
        list.add("com.lilithgame.isoland2.gpen")
        list.add("com.lilithgames.mrpumpkin2.gp")
        list.add("com.duokan.phone.remotecontroller")
        list.add("com.xiaomi.midrop")
        list.add("com.mi.android.globalminusscreen")
        list.add("com.mi.android.globalFileexplorer")
        list.add("com.mi.globalbrowser")
        list.add("com.miui.videoplayer")
        list.add("com.xiaomi.smarthome")
        list.add("com.miui.calculator")
        list.add("com.miui.android.fashiongallery")
        list.add("com.miui.weather2")
        list.add("com.mi.android.globalpersonalassistant")
        list.add("com.mi.android.globallauncher")
        list.add("com.micredit.in.gp")
        list.add("com.miui.huanji")
        list.add("com.mint.keyboard")
        list.add("com.mi.globalbrowser.mini")
        list.add("com.duokan.phone.remotecontroller.peel.plugin")
        list.add("com.xiaomi.router")
        list.add("com.xiaomi.mico")
        list.add("com.miui.miwallpaper.earth")
        list.add("com.mi.android.go.globallauncher")
        list.add("com.mipay.in.wallet")
        list.add("com.mobile.legends")
        list.add("com.moonton.mobilehero")
        list.add("com.quvideo.xiaoying")
        list.add("com.quvideo.vivavideo.lite")
        list.add("com.quvideo.slideplus")
        list.add("com.quvideo.xiaoying.pro")
        list.add("com.uc.iflow")
        list.add("com.uc.vidchat")
        list.add("com.apusapps.browser")
        list.add("com.mi.global.bbs")
        list.add("com.mi.global.shop")
        list.add("com.mi.global.jointly")
        list.add("com.DU.speed.booster.Antivirus.cleaner")
        list.add("com.DUsavebattery.faster.charge")
        list.add("com.DU.antivirus.cleaner.boosterpro")
        list.add("com.DU.Cleaner.antivirus.cleanbooster")
        list.add("com.DUcalleradress.trackerlocation.callerid")
        list.add("com.DUrecorder.screenrecorder.videorecorde")
        list.add("com.baidu.BaiduMap")
        list.add("com.yubitu.android.YubiCollage")
        list.add("com.yubitu.android.YouFace")
        list.add("com.yubitu.android.BestieCam")
        list.add("com.tencent.mobileqq")
        list.add("com.tencent.weishi")
        list.add("com.tencent.androidqqmail")
        list.add("com.tencent.wework")
        list.add("com.tencent.qqmusic")
        list.add("com.tencent.weread")
        list.add("com.qcloud.cos.client")
        list.add("com.tencent.ait")
        list.add("com.tencent.qqsports")
        list.add("com.tencent.portfolio")
        list.add("com.qq.qcloud")
        list.add("com.tencent.ttpic")
        list.add("com.tencent.radio")
        list.add("com.tencent.qqcar")
        list.add("com.tencent.liveassistant")
        list.add("com.tencent.k12")
        list.add("com.tencent.weworklocal")
        list.add("com.tencent.qpaint")
        list.add("com.tencent.weiyungallery")
        list.add("com.miui.player")
        list.add("com.xiaomi.hm.health")
        list.add("com.zepp.ztennis")
        list.add("com.huami.app.activities.stanford")
        list.add("com.zepp.zgolf")
        list.add("com.zepp.baseball")
        list.add("com.zepp.soccer")
        list.add("com.zepp.zepp_tennis")
        list.add("com.netease.mail")
        list.add("com.netease.mobimail")
        list.add("com.lofter.android")
        list.add("com.netease.buff163")
        list.add("com.zhiliaoapp.musically.go")
        list.add("com.ss.android.ugc.trill.go")
        list.add("com.ss.android.ugc.boomlite")
        list.add("com.ss.android.ugc.tiktok.livewallpaper")
        list.add("com.zhiliao.musically.livewallpaper")
        list.add("com.bingo.livetalk")
        list.add("us.zoom.videomeetings")

        list.add("com.apusapps.launcher.pro")
        list.add("com.apusapps.launcher")
        list.add("com.apusapps.turbocleaner")
        list.add("com.apusapps.tools.unreadtips")
        list.add("com.guardian.security.pri")
        list.add("com.apusapps.tools.flashtorch")
        list.add("com.guardian.security.pri.lenovo")
        list.add("com.lemon.faceu.oversea")
        list.add("com.intsig.BCRLite")
        list.add("com.intsig.lic.camscanner")
        list.add("com.intsig.notes")
        list.add("com.intsig.BizCardReader")
        list.add("com.intsig.camscannerhd")
        list.add("com.intsig.camocr")
        list.add("com.intsig.camcard.enterprise")
        list.add("com.intsig.BCRLatam")
        list.add("com.intsig.camcard.sfdc")
        list.add("com.tencent.ibg.joox")
        list.add("com.tencent.voov")
        list.add("com.tencent.ibg.jooxtv")
        list.add("com.tencent.ibg.ipick")
        list.add("com.mobikeeper.global")
        list.add("com.netease.mrzhna")
        list.add("com.titan.cd.gb")
        list.add("com.netease.eve.en")
        list.add("com.netease.ddsfna")
        list.add("com.netease.sheltergp")
        list.add("com.netease.chiji")
        list.add("om.netease.disorder")
        list.add("com.netease.lztgglobal")
        list.add("com.netease.ko")
        list.add("com.netease.uu")
        list.add("com.netease.RideOutHeroes")
        list.add("com.netease.onmyoji.gb")
        list.add("com.netease.g93na")
        list.add("com.netease.idv.googleplay")
        list.add("com.netease.g104na.gb")
        list.add("com.netease.hdjygb")
        list.add("com.netease.frxyna")
        list.add("com.netease.tjglobal")
        list.add("com.netease.wxzcglobal")
        list.add("com.netease.vr")
        list.add("com.netease.kolite")
        list.add("com.netease.g78na.gb")
        list.add("com.lilithgame.hgame.gp")
        list.add("com.lilithgame.roc.gp")
        list.add("com.lilithgame.tgames.gp")
        list.add("com.lilithgame.isoland2.gp.mf")
        list.add("us.kick9.k3000000013.c3101000001")
        list.add("com.netease.gloryofempire")
        list.add("com.beauty.camera.youcam.makeup.photo.editor.plus")
        list.add("com.wordoffice.docx.docs.docxreader.freeword")
        list.add("free.secure.vpn.unblock.proxy.gospeed")
        list.add("com.cricSessionUpdate.cricketLiveLine")
        list.add("com.goGoAnimeMv.oroAnimiiMovies")
        list.add("com.typinggujjuVoice.typingingujrati")
        list.add("com.yeelyn.jinrimeitu")
        list.add("com.dkoqwl.jfdraf")
        list.add("com.gareqeaa.zhu")
        list.add("com.asge.aeor")
        list.add("com.huya.kiwi")
        list.add("com.superchinese")
        list.add("com.hskonline")
        list.add("com.netease.g105na")
        list.add("cn.com.sina.finance")
        list.add("com.sina.shiye")
        list.add("com.sina.vdun")
        list.add("skydragon.honorofkings")
        list.add("com.youku.phone")
        list.add("com.taobao.taobao")
        list.add("com.taobao.litetao")
        list.add("com.alibaba.android.rimet")
        list.add("com.taobao.trip")
        list.add("com.taobao.qianniu")
        list.add("com.alibaba.icbu.app.aliexpress.seller")
        list.add("com.taobao.taoshehui")
        list.add("com.taobao.trip.merchant")
        list.add("com.taobao.live")
        list.add("com.taobao.htao.android")
        list.add("com.kitty.android")
        list.add("com.mico")
        list.add("com.mico.roam")
        list.add("com.p1.mobile.putong")
        list.add("com.gorgeous.liteinternational")
        list.add("com.lemon.lvoverseas")
        list.add("com.lemon.faceu.oversea")
        list.add("com.youdao.hindict")
        list.add("com.youdao.uclass")
        list.add("com.youdao.cloudpen")
        list.add("com.jb.gosms")
        list.add("com.video.master")
        list.add("com.jb.gokeyboard")
        list.add("com.jb.gokeyboardpro")
        list.add("com.jb.screenrecorder.screen.record.video")
        list.add("com.jb.zcamera")
        list.add("com.jb.emoji.gokeyboard")
        list.add("com.jiubang.darlingclock")
        list.add("com.gto.zero.zboost")
        list.add("com.jb.security")
        list.add("com.go.flo")
        list.add("com.jiubang.alock")
        list.add("com.calculator.scientific.pro")
        list.add("com.ace.cleaner")
        list.add("com.gtarcade.lhjxindia")
        list.add("com.yoozoogames.ludogameallstar")
        list.add("com.yoozoogames.carromfriendsboardgames")
        list.add("com.yoozoogames.bikeracingtrafficrider")
        list.add("com.newbiz.mvmaster")
        list.add("com.video.music")
        list.add("com.asiainno.uplive.aiglamour")
        list.add("photo.album.hd.gallery.quickpic")
        list.add("om.thinkyeah.smslocker")
        list.add("com.thinkyeah.smartlockfree")
        list.add("com.thinkyeah.apphider")
        list.add("dcmobile.thinkyeah.launcher")
        list.add("com.thinkyeah.galleryvault")
        list.add("com.thinkyeah.galleryvault.key")
        list.add("com.wondergames.warpath.gp")
        list.add("com.wondergames.warpath.gp.ptr")
        list.add("ast.explorer.web.browser")
        list.add("cleanmaster.phone.memory.booster.cleaner")
        list.add("audio.effect.music.equalizer.musicplayer")
        list.add("media.audioplayer.musicplayer")
        list.add("cleaner.phone.booster.memory.clean")
        list.add("com.mine.videoplayer")
        list.add("com.eliferun.music")
        list.add("photo.video.private.photogallery")
        list.add("photo.filter.selfie.beauty.camera")
        list.add("weather.local.weather.forecast.channel")
        list.add("net.fast.web.browser")
        list.add("fast.private.secure.browser")
        list.add("media.bassbooster.audioplayer.musicplayer")
        list.add("photo.view.hd.gallery")
        list.add("online.video.hd.videoplayer")
        list.add("com.elift.hdplayer")
        list.add("com.shaiban.audioplayer.mplayer")
        list.add("com.ludashi.dualspace")
        list.add("com.ludashi.superboost")
        list.add("com.ludashi.dualspace.addon.arm32")
        list.add("com.ludashi.dualspaceprox")
        list.add("com.ludashi.superboost.addon.arm32")
        list.add("com.ludashi.dualspace.addon.arm64")
        list.add("image.photoedit.photogallery")
        list.add("com.camerasideas.instashot")
        list.add("videoeditor.videorecorder.screenrecorder")
        list.add("photo.editor.photoeditor.photoeditorpro")
        list.add("com.camerasideas.trimmer")
        list.add("photo.editor.photoeditor.filtersforpictures")
        list.add("video.downloader.videodownloader")
        list.add("cast.video.screenmirroring.casttotv")
        list.add("video.player.videoplayer")
        list.add("videoeditor.videomaker.videoeditorforyoutube")
        list.add("glitchvideoeditor.videoeffects.glitchvideoeffect")
        list.add("ringtone.maker.mp3.cutter.audio")
        list.add("all.video.downloader.allvideodownloader")
        list.add("musicplayer.musicapps.music.mp3player")
        list.add("mp3videoconverter.videotomp3.videotomp3converter")
        list.add("castwebbrowsertotv.castwebvideo.webvideocaster")
        list.add("sharefiles.sharemusic.shareapps.filetransfer")
        list.add("gallery.hidepictures.photovault.lockgallery")
        list.add("screen.mirroring.screenmirroring")
        list.add("vhs.vaporwave.glitcheffects.glitchphotoeditor")
        list.add("apkshare.shareapps.filetransfer.shareit.bluetooth")
        list.add("freemusic.download.musicplayer.mp3player")
        list.add("com.downloader.privatebrowser")
        list.add("com.northpark.beautycamera")
        list.add("hidepictures.videolocker.videohider")
        list.add("instagramstory.instastory.storymaker")
        list.add("qrscanner.barcodescanner.barcodereader.qrcodereader")
        list.add("com.inshot.neonphotoeditor")
        list.add("hd.video.player.hd.videoplayer")
        list.add("videoplayer.videoplayerhd.fullhdvideoplayer")
        list.add("customstickermaker.whatsappstickers.personalstickersforwhatsapp")
        list.add("sound.effect.equalizer.musicplayer")
        list.add("music.amplifier.volume.booster.equalizer")
        list.add("music.basss.booster.effect.equalizer")
        list.add("free.online.hd.video.player")
        list.add("image.photoedit.photogallery")
        list.add("photo.album.galleryvault.photogallery")
        list.add("tool.keypad.locker.lockscreen")
        list.add("audio.mp3.free.music.player")
        list.add("photo.selfie.camera.hdcamera")
        list.add("cleanmaster.phone.memory.booster.cleaner")
        list.add("music.audio.effect.equalizer")
        list.add("media.music.musicplayer.mp3player")
        list.add("photo.beauty.sticker.ar.camera")
        list.add("fast.explorer.web.browser")
        list.add("photo.album.hd.gallery.quickpic")
        list.add("privacy.explorer.fast.safe.browser")
        list.add("audioplayer.free.music.player")
        list.add("sound.effect.virtrualizer.equalizer.musicplayer")
        list.add("media.hd.photo.selfie.camera")
        list.add("photo.selfie.beauty.candy.camera")
        list.add("video.player.mediaplayer.hdvideoplayer")
        list.add("video.player.hd.videoplayer")
        list.add("free.download.mp3.audio.music")
        list.add("tool.notepad.notes.notebooks")
        list.add("audio.free.music.equalizer.musicplayer")
        list.add("secure.explorer.web.browser")
        list.add("hd.photo.video.selfie.camera")
        list.add("weather.forecast.live.weather")
        list.add("media.adfree.music.mp3player")
        list.add("freemusic.equalizer.bassbooster.musicplayer")
        list.add("tool.qr.scanner.barcode.scanner")



        list.add("com.soul.android.international.global")
        list.add("com.soul.android.international")
        list.add("com.innovate.ChinaSocial")
        list.add("com.mingle.SwissCupid")
        list.add("com.innovate.FilipinoSocial")
        list.add("com.innovate.IndonesiaSocial")
        list.add("com.innovate.HongKongSocial")
        list.add("com.innovate.BlackPeopleMingle")
        list.add("com.innovate.UkraineSocial")
        list.add("com.innovate.KoreaSocial")
        list.add("com.mingle.NorwayCupid")
        list.add("com.innovate.RussianSocial")
        list.add("com.innovate.ChinaSocial")
        list.add("com.mingle.dateinasia")
        list.add("com.mingle.PolishCupid")
        list.add("com.innovate.ColombianSocial")
        list.add("com.mingle.DutchCupid")
        list.add("com.innovate.IsraelCupid")
        list.add("com.innovate.BrazilSocial")
        list.add("com.mingle.PortugalCupid")
        list.add("com.mingle.SpainCupid")
        list.add("com.mingle.AussieSocial")
        list.add("com.innovate.SingaporeSocial")
        list.add("com.mingle.ItalianCupid")
        list.add("com.mingle.TurkishCupid")
        list.add("com.innovate.JapanSocial")
        list.add("com.mingle.ChileanCupid")
        list.add("com.mingle.UKCupid")
        list.add("com.innovate.IranCupid")
        list.add("com.innovate.VietSocial")
        list.add("com.innovate.SouthAfricaSocial")
        list.add("com.innovate.ThaiSocial")
        list.add("com.innovate.MexicoSocial")
        list.add("com.mingle.SwedishCupid")
        list.add("com.innovate.EgyptCupid")
        list.add("com.innovate.SaudiArabiaCupid")
        list.add("com.mingle.GermanCupid")
        list.add("com.mingle.FranceCupid")
        list.add("com.innovate.UnitedArabEmiratesCupid")
        list.add("com.mingle.VenezuelaCupid")
        list.add("com.mingle.SwissCupid")
        list.add("com.rometic.trulyasian")
        list.add("com.rometic.trulychinese")
        list.add("com.rometic.trulyafrican")
        list.add("com.rometic.trulyfilipino")
        list.add("com.rometic.trulyrussian")
        list.add("com.rometic.trulyladyboy")
        list.add("com.adore.international")
        list.add("com.guysonlydating")
        list.add("com.yourchristiandate")
        list.add("com.tubit")
        list.add("com.datemyage")
        list.add("com.asiandate")
        list.add("com.chinalove")
        list.add("com.eurodate")
        list.add("com.russianbrides")
        list.add("com.rsg.heroesevolved")
        list.add("com.tqnd.arcdhd")
        list.add("com.Tq.CQ2ClientAndroid")
        list.add("com.Tq.CQPokerClub")
        list.add("com.tq.my.gp")
        list.add("com.Tq.CQ2ClientAndroid.Spanish")
        list.add("com.Tq.CQ2ClientAndroid.Arabic")
        list.add("com.happyelements.cupid.gp")
        list.add("com.happyelements.happyfishml")
        list.add("com.happyelements.xstorycatdetective")
        list.add("com.lilithgame.isoland2.gpen")
        list.add("com.lilithgame.isoland2.gp.mf")
        list.add("com.lilithgames.mrpumpkin2.gp")
        list.add("com.Lilith.Abi")
        list.add("com.alibaba.android.rimet")
        list.add("com.taobao.litetao")
        list.add("com.taobao.trip.merchant")
        list.add("com.taobao.qianniu")
        list.add("com.alibaba.icbu.app.aliexpress.seller")
        list.add("com.taobao.htao.android")
        list.add("com.taobao.live")
        list.add("com.taobao.trip")
        list.add("com.luckylive.tv")
        list.add("com.tencent.qqlivei18n.lite")
        list.add("com.tencent.qqlivei18n")
        list.add("com.ktcp.osvideo")
        list.add("com.hunantv.imgo.activity.inter")
        list.add("com.mgtv.tv.intl")
        list.add("com.everonet.truemoney")
        list.add("com.everonet.alicashier")
        list.add("com.everonet.boccc")
        list.add("com.everonet.dsb")
        list.add("com.everonet.evocashier")
        list.add("com.everonet.bkk.pro")
        list.add("com.thel.global")
        list.add("com.alibaba.aliexpresshd")
        list.add("com.alibaba.intl.android.apps.poseidon")
        list.add("com.alibaba.icbu.app.seller")
        list.add("com.alibaba.intl.android.apps.twa")
        list.add("com.alibaba.aliexpress.itao")
        list.add("com.lalamove.client.india")
        list.add("com.lalamove.global.driver.india")
        list.add("com.lalamove.driver.india")
        list.add("com.kwai.bulldog")
        list.add("com.intsig.BCRLite")
        list.add("com.intsig.BCRLatam")
        list.add("com.intsig.BizCardReader")
        list.add("com.microfun.munchkin")
        list.add("com.jellyblast.cmcm")
        return list
    }

    fun getChineseAlternativeApp(pacakgeName: String): List<AlternativeApp> {
        val map = HashMap<String, ArrayList<AlternativeApp>>()


        map["app.buzz.share"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("in.mohalla.sharechat", "ShareChat - Made in India"))
        }
        map["app.buzz.share.lite"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("in.mohalla.sharechat", "ShareChat - Made in India"))
        }
        map["com.lenovo.anyshare.gps"] = ArrayList<AlternativeApp>().apply {
            add(
                AlternativeApp(
                    "com.google.android.apps.nbu.files",
                    "Files by Google: Clean up space on your phone"
                )
            )
        }
        map["shareit.lite"] = ArrayList<AlternativeApp>().apply {
            add(
                AlternativeApp(
                    "com.google.android.apps.nbu.files",
                    "Files by Google: Clean up space on your phone"
                )
            )
        }
        map["cn.xender"] = ArrayList<AlternativeApp>().apply {
            add(
                AlternativeApp(
                    "com.google.android.apps.nbu.files",
                    "Files by Google: Clean up space on your phone"
                )
            )
        }
        map["com.ushareit.watchit"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.instagram.android", "Instagram"))
            add(AlternativeApp("com.facebook.katana", "Facebook"))
            add(AlternativeApp("com.instagram.igtv", "IGTV"))
            add(AlternativeApp("com.google.android.youtube", "YouTube"))
            add(AlternativeApp("com.google.android.apps.youtube.mango", "YouTube Go"))
        }
        map["com.ss.android.ugc.boom"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.instagram.android", "Instagram"))
            add(AlternativeApp("com.facebook.katana", "Facebook"))
            add(AlternativeApp("com.instagram.igtv", "IGTV"))
            add(AlternativeApp("com.google.android.youtube", "YouTube"))
            add(AlternativeApp("com.google.android.apps.youtube.mango", "YouTube Go"))
        }
        map["com.uc.vmate"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.instagram.android", "Instagram"))
            add(AlternativeApp("com.facebook.katana", "Facebook"))
            add(AlternativeApp("com.instagram.igtv", "IGTV"))
            add(AlternativeApp("com.google.android.youtube", "YouTube"))
            add(AlternativeApp("com.google.android.apps.youtube.mango", "YouTube Go"))
        }
        map["com.zhiliaoapp.musically"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.instagram.android", "Instagram"))
            add(AlternativeApp("com.facebook.katana", "Facebook"))
            add(AlternativeApp("com.instagram.igtv", "IGTV"))
            add(AlternativeApp("com.google.android.youtube", "YouTube"))
            add(AlternativeApp("com.google.android.apps.youtube.mango", "YouTube Go"))
        }
        map["com.kwai.video"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.instagram.android", "Instagram"))
            add(AlternativeApp("com.facebook.katana", "Facebook"))
            add(AlternativeApp("com.instagram.igtv", "IGTV"))
            add(AlternativeApp("com.google.android.youtube", "YouTube"))
            add(AlternativeApp("com.google.android.apps.youtube.mango", "YouTube Go"))
        }
        map["video.like"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.instagram.android", "Instagram"))
            add(AlternativeApp("com.facebook.katana", "Facebook"))
            add(AlternativeApp("com.instagram.igtv", "IGTV"))
            add(AlternativeApp("com.google.android.youtube", "YouTube"))
            add(AlternativeApp("com.google.android.apps.youtube.mango", "YouTube Go"))
        }
        map["com.ss.android.ugc.boom"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.instagram.android", "Instagram"))
            add(AlternativeApp("com.facebook.katana", "Facebook"))
            add(AlternativeApp("com.instagram.igtv", "IGTV"))
            add(AlternativeApp("com.google.android.youtube", "YouTube"))
            add(AlternativeApp("com.google.android.apps.youtube.mango", "YouTube Go"))
        }

        map["com.uc.vmate"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.instagram.android", "Instagram"))
            add(AlternativeApp("com.facebook.katana", "Facebook"))
            add(AlternativeApp("com.instagram.igtv", "IGTV"))
            add(AlternativeApp("com.google.android.youtube", "YouTube"))
            add(AlternativeApp("com.google.android.apps.youtube.mango", "YouTube Go"))
        }

        map["com.zhiliao.musically.livewallpaper"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.google.android.apps.wallpaper", "Wallpapers"))
        }
        map["com.ss.android.ugc.boom.livewallpaper"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.google.android.apps.wallpaper", "Wallpapers"))
        }
        map["com.ss.android.ugc.boom.livewallpaper"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.google.android.apps.wallpaper", "Wallpapers"))
        }
        map["com.CricChat.intl"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.cricbuzz.android", "Cricbuzz - Live Cricket Scores & News"))
            add(AlternativeApp("com.cricbuzz.android.vernacular", "Cricbuzz - In Indian Languages"))
            add(
                AlternativeApp(
                    "com.july.cricinfo",
                    "ESPNCricinfo - Live Cricket Scores, News & Videos"
                )
            )
            add(
                AlternativeApp(
                    "com.crictec.cricket",
                    "Cricket.com - Live Score, Match Predictions & News"
                )
            )
        }
        map["com.ucturbo"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.opera.browser", "Opera browser with free VPN"))
            add(
                AlternativeApp(
                    "com.brave.browser",
                    "Brave Private Browser: Fast, safe web browser"
                )
            )
            add(AlternativeApp("com.android.chrome", "Google Chrome: Fast & Secure"))
            add(AlternativeApp("org.mozilla.firefox", "Firefox Browser"))
        }
        map["com.uc.browser.en"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.opera.browser", "Opera browser with free VPN"))
            add(
                AlternativeApp(
                    "com.brave.browser",
                    "Brave Private Browser: Fast, safe web browser"
                )
            )
            add(AlternativeApp("com.android.chrome", "Google Chrome: Fast & Secure"))
            add(AlternativeApp("org.mozilla.firefox", "Firefox Browser"))
        }
        map["com.UCMobile.intl"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("Just Don't use this app", "Don't even think about using this app"))
        }
        map["com.bingo.livetalk"] = ArrayList<AlternativeApp>().apply {
            add(
                AlternativeApp(
                    "com.google.android.apps.tachyon",
                    "Google Duo - High Quality Video Calls"
                )
            )
        }
        map["sg.bigo.live"] = ArrayList<AlternativeApp>().apply {
            add(
                AlternativeApp(
                    "com.google.android.apps.tachyon",
                    "Google Duo - High Quality Video Calls"
                )
            )
            add(AlternativeApp("com.instagram.android", "Instagram"))
        }
        map["sg.bigo.live.lite"] = ArrayList<AlternativeApp>().apply {
            add(
                AlternativeApp(
                    "com.google.android.apps.tachyon",
                    "Google Duo - High Quality Video Calls"
                )
            )
            add(AlternativeApp("com.instagram.android", "Instagram"))
        }
        map["com.magicv.airbrush"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.niksoftware.snapseed", "Snapseed"))
            add(
                AlternativeApp(
                    "com.joeware.android.gpulumera",
                    "Candy Camera - selfie, beauty camera, photo editor"
                )
            )
        }
        map["com.commsource.beautyplus"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.niksoftware.snapseed", "Snapseed"))
            add(
                AlternativeApp(
                    "com.joeware.android.gpulumera",
                    "Candy Camera - selfie, beauty camera, photo editor"
                )
            )
        }
        map["com.meitu.makeup"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.niksoftware.snapseed", "Snapseed"))
            add(
                AlternativeApp(
                    "com.joeware.android.gpulumera",
                    "Candy Camera - selfie, beauty camera, photo editor"
                )
            )
        }
        map["com.mt.mtxx.mtxx"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.niksoftware.snapseed", "Snapseed"))
            add(
                AlternativeApp(
                    "com.joeware.android.gpulumera",
                    "Candy Camera - selfie, beauty camera, photo editor"
                )
            )
        }
        map["com.meitu.meiyancamera"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.niksoftware.snapseed", "Snapseed"))
            add(
                AlternativeApp(
                    "com.joeware.android.gpulumera",
                    "Candy Camera - selfie, beauty camera, photo editor"
                )
            )
        }
        map["com.meitu.oxygen"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.niksoftware.snapseed", "Snapseed"))
            add(
                AlternativeApp(
                    "com.joeware.android.gpulumera",
                    "Candy Camera - selfie, beauty camera, photo editor"
                )
            )
        }
        map["com.meitu.facefactory"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.niksoftware.snapseed", "Snapseed"))
            add(
                AlternativeApp(
                    "com.joeware.android.gpulumera",
                    "Candy Camera - selfie, beauty camera, photo editor"
                )
            )
        }
        map["com.meitu.wheecam"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.niksoftware.snapseed", "Snapseed"))
            add(
                AlternativeApp(
                    "com.joeware.android.gpulumera",
                    "Candy Camera - selfie, beauty camera, photo editor"
                )
            )
        }
        map["com.tencent.ttpic"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.niksoftware.snapseed", "Snapseed"))
            add(
                AlternativeApp(
                    "com.joeware.android.gpulumera",
                    "Candy Camera - selfie, beauty camera, photo editor"
                )
            )
        }

        map["com.beautyplus.pomelo.filters.photo"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.niksoftware.snapseed", "Snapseed"))
            add(
                AlternativeApp(
                    "com.joeware.android.gpulumera",
                    "Candy Camera - selfie, beauty camera, photo editor"
                )
            )
        }

        map["com.intsig.camscanner"] = ArrayList<AlternativeApp>().apply {
            add(
                AlternativeApp(
                    "com.microsoft.office.officelens",
                    "Microsoft Office Lens - PDF Scanner"
                )
            )
            add(
                AlternativeApp(
                    "com.adobe.scan.android",
                    "Adobe Scan: PDF Scanner with OCR, PDF Creator"
                )
            )
        }
        map["com.tencent.iglite"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.activision.callofduty.shooter", "Call of Duty®: Mobile"))
        }

        map["com.tencent.ig"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.activision.callofduty.shooter", "Call of Duty®: Mobile"))
        }

        map["com.tencent.ludosuperstar"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.ludo.king", "Ludo King"))
        }

        map["com.hcg.cok.gp"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.supercell.clashofclans", "Clash of Clans"))
        }
        map["com.hcg.ctw.gp"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.supercell.clashofclans", "Clash of Clans"))
        }
        map["com.elex.coq.gp"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.supercell.clashofclans", "Clash of Clans"))
        }

        map["club.fromfactory"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.flipkart.android", "Flipkart Online Shopping App"))
            add(
                AlternativeApp(
                    "in.amazon.mShop.android.shopping",
                    "Amazon Shopping, UPI, Money Transfer, Bill Payment"
                )
            )
        }

        map["com.zzkko"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.flipkart.android", "Flipkart Online Shopping App"))
            add(
                AlternativeApp(
                    "in.amazon.mShop.android.shopping",
                    "Amazon Shopping, UPI, Money Transfer, Bill Payment"
                )
            )
        }

        map["us.zoom.videomeetings"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.google.android.apps.meetings", "Google Meet"))
            add(AlternativeApp("com.skype.raider", "Skype - free IM & video calls"))
        }

        map["com.nono.android"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.google.android.apps.meetings", "Google Meet"))
            add(AlternativeApp("com.skype.raider", "Skype - free IM & video calls"))
        }

        map["com.nono.go"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.google.android.apps.meetings", "Google Meet"))
            add(AlternativeApp("com.skype.raider", "Skype - free IM & video calls"))
        }
        map["free.vpn.unblock.proxy.turbovpn"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("ch.protonvpn.android", "ProtonVPN - Free VPN, Secure & Unlimited"))
            add(AlternativeApp("com.opera.browser", "Opera browser with free VPN"))
        }
        map["free.vpn.unblock.proxy.vpnmonster"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("ch.protonvpn.android", "ProtonVPN - Free VPN, Secure & Unlimited"))
            add(AlternativeApp("com.opera.browser", "Opera browser with free VPN"))
        }
        map["free.vpn.unblock.proxy.turbovpn.lite"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.opera.browser", "Opera browser with free VPN"))
            add(AlternativeApp("ch.protonvpn.android", "ProtonVPN - Free VPN, Secure & Unlimited"))
        }
        map["com.tencent.mm"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.facebook.orca", "Messenger – Text and Video Chat for Free"))
            add(AlternativeApp("com.whatsapp", "WhatsApp Messenger"))
            add(AlternativeApp("org.telegram.messenger", "Telegram"))
        }
        map["com.domobile.applockwatcher"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.symantec.applock", "Norton App Lock"))
        }
        map["com.domobile.applock.lite"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.symantec.applock", "Norton App Lock"))
        }

        map["com.domobile.mixnote"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.google.android.keep", "Google Keep - Notes and Lists"))
            add(AlternativeApp("com.evernote", "Evernote - Notes Organizer & Daily Planner"))
        }

        map["com.newsdog"] = ArrayList<AlternativeApp>().apply {
            add(
                AlternativeApp(
                    "com.google.android.apps.magazines",
                    "Google News: Top World & Local News Headlines"
                )
            )
            add(AlternativeApp("com.eterno", "Dailyhunt (Newshunt)- News, Videos, Cricket"))
        }

        map["com.youdao.hindict"] = ArrayList<AlternativeApp>().apply {
            add(AlternativeApp("com.google.android.apps.translate", "Google Translate"))
        }

        map["com.flashkeyboardtheme"] = ArrayList<AlternativeApp>().apply {
            add(
                AlternativeApp(
                    "com.google.android.inputmethod.latin",
                    "Gboard - the Google Keyboard"
                )
            )
        }

        map["com.netease.mobimail"] = ArrayList<AlternativeApp>().apply {
            // gmai;,outlook
            add(
                AlternativeApp(
                    "com.google.android.inputmethod.latin",
                    "Gboard - the Google Keyboard"
                )
            )
        }

        map["com.netease.mail"] = ArrayList<AlternativeApp>().apply {
            // gmai;,outlook
            add(
                AlternativeApp(
                    "com.google.android.inputmethod.latin",
                    "Gboard - the Google Keyboard"
                )
            )
        }

        map["com.zepp.soccer"] = ArrayList<AlternativeApp>().apply {
            // one football
            add(
                AlternativeApp(
                    "com.google.android.inputmethod.latin",
                    "Gboard - the Google Keyboard"
                )
            )
        }

        map["com.xiaomi.hm.health"] = ArrayList<AlternativeApp>().apply {
            // google fit
            add(
                AlternativeApp(
                    "com.google.android.inputmethod.latin",
                    "Gboard - the Google Keyboard"
                )
            )
        }

        map["com.miui.player"] = ArrayList<AlternativeApp>().apply {
            // music player
            add(
                AlternativeApp(
                    "com.google.android.inputmethod.latin",
                    "Gboard - the Google Keyboard"
                )
            )
        }
        map["com.baidu.BaiduMap"] = ArrayList<AlternativeApp>().apply {
            // google maps
            add(
                AlternativeApp(
                    "com.google.android.inputmethod.latin",
                    "Gboard - the Google Keyboard"
                )
            )
        }

        return map[pacakgeName] ?: ArrayList<AlternativeApp>().apply {
            AlternativeApp(
                "we couldn't find an alternative.",
                "please share with us if u know one."
            )
        }

    }

}