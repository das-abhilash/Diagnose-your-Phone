package com.zollet.diagnoseyourapp.util

import android.content.Context
import android.content.Intent
import android.net.Uri
import com.zollet.diagnoseyourapp.models.AlternativeApp

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