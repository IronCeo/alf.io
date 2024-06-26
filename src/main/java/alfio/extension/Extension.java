/**
 * This file is part of alf.io.
 *
 * alf.io is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * alf.io is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with alf.io.  If not, see <http://www.gnu.org/licenses/>.
 */

package alfio.extension;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Extension {

    private final String path;
    private final String name;
    private final String script;
    private final boolean enabled;

    public String getPath() {
        return path;
    }

    public String getName() {
        return name;
    }

    public String getScript() {
        return script;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public Extension(@JsonProperty("path") String path,
                     @JsonProperty("name") String name,
                     @JsonProperty("script") String script,
                     @JsonProperty("enabled") boolean enabled) {
        this.path = path;
        this.name = name;
        this.script = script;
        this.enabled = enabled;
    }
}
