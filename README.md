Sample Facebook Canvas Application using Play Framework and restfb
==================================================================

+   Play Framework v.2.3.4
+   restfb v.1.6.16
+   Facebook Javascript SDK

Configuration
============

Modify **appID** and replace it with your appID ( File: **app/views/index.scala.html**)

            FB.init ( {
                appId : '699976683425267',
                xfbml : true,
                version : 'v2.1'
            } ) ;

Demo:
=====

Available at: https://apps.facebook.com/699976683425267/


https://gist.github.com/dhavaln/1468072
http://restfb.com/
http://restfb.com/javadoc/index.html
https://developers.facebook.com/tools/explorer/145634995501895/?method=GET&path=%7Buser-id%7D&version=v2.1
https://developers.facebook.com/docs/sharing/reference/feed-dialog/v2.4
