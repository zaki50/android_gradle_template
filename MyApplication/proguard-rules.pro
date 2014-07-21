-dontwarn sun.misc.Unsafe

# Needed by google-api-client to keep generic types and @Key annotations accessed via reflection
-keepclassmembers class * {
  @com.google.api.client.util.Key <fields>;
}
-keepattributes Signature,RuntimeVisibleAnnotations,AnnotationDefault

-dontwarn org.springframework.http.HttpAuthentication
-dontwarn org.springframework.web.client.RestTemplate
-dontwarn org.springframework.web.client.RestClientException

# for Google Play Services (see http://developer.android.com/google/play-services/setup.html )
-keep class * extends java.util.ListResourceBundle {
    protected Object[][] getContents();
}
-keep public class com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    public static final *** NULL;
}
-keepnames @com.google.android.gms.common.annotation.KeepName class *
-keepclassmembernames class * {
    @com.google.android.gms.common.annotation.KeepName *;
}
-keepnames class * implements android.os.Parcelable {
    public static final ** CREATOR;
}

# for Butter Knife
-dontwarn butterknife.internal.**
-keep class **$$ViewInjector { *; }
-keepnames class * { @butterknife.InjectView *;}

# for dagger compiler
-dontwarn dagger.internal.codegen.**

# for EventBus
-keepclassmembers class ** {
    public void onEvent*(**);
}

# for support renderscript
-keep class android.support.v8.renderscript.** { *; }