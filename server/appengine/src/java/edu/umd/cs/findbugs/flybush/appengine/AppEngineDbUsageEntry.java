package edu.umd.cs.findbugs.flybush.appengine;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
import edu.umd.cs.findbugs.flybush.DbUsageEntry;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class AppEngineDbUsageEntry implements DbUsageEntry {

    @SuppressWarnings({ "UnusedDeclaration" })
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;

    @Persistent
    private String version;
    @Persistent
    private String appName;
    @Persistent
    private String appVersion;
    @Persistent
    private String entryPoint;
    @Persistent
    private String os;
    @Persistent
    private String javaVersion;
    @Persistent
    private String uuid;
    @Persistent
    private String plugin;
    @Persistent
    private String pluginName;
    @Persistent
    private String pluginVersion;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getEntryPoint() {
        return entryPoint;
    }

    public void setEntryPoint(String entryPoint) {
        this.entryPoint = entryPoint;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getJavaVersion() {
        return javaVersion;
    }

    public void setJavaVersion(String javaVersion) {
        this.javaVersion = javaVersion;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getPlugin() {
        return plugin;
    }

    public void setPlugin(String plugin) {
        this.plugin = plugin;
    }

    public String getPluginName() {
        return pluginName;
    }

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    public String getPluginVersion() {
        return pluginVersion;
    }

    public void setPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
    }

    @Override
    public DbUsageEntry copy() {
        AppEngineDbUsageEntry copy = new AppEngineDbUsageEntry();
        copy.setAppName(appName);
        copy.setAppVersion(appVersion);
        copy.setEntryPoint(entryPoint);
        copy.setJavaVersion(javaVersion);
        copy.setOs(os);
        copy.setPlugin(plugin);
        copy.setPluginName(pluginName);
        copy.setPluginVersion(pluginVersion);
        copy.setUuid(uuid);
        copy.setVersion(version);
        return copy;
    }

    @Override
    public String toString() {
        return "AppEngineDbUsageEntry{" +
                "version='" + version + '\'' +
                ", appName='" + appName + '\'' +
                ", appVersion='" + appVersion + '\'' +
                ", entryPoint='" + entryPoint + '\'' +
                ", os='" + os + '\'' +
                ", javaVersion='" + javaVersion + '\'' +
                ", uuid='" + uuid + '\'' +
                ", plugin='" + plugin + '\'' +
                ", pluginName='" + pluginName + '\'' +
                ", pluginVersion='" + pluginVersion + '\'' +
                '}';
    }
}