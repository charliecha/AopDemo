package org.charlie.aspectj.plugin

class Extension {
    def enabled = true

    def setEnabled(boolean enabled) {
        this.enabled = enabled
    }

    def getEnabled() {
        return enabled;
    }
}