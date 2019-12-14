package org.hexworks.zircon.api.behavior

import org.hexworks.cobalt.databinding.api.property.Property
import org.hexworks.zircon.api.resource.TilesetResource

/**
 * Interface which adds functionality for overriding tilesets used
 * in its implementors (components, layers, etc).
 */
interface TilesetOverride : TilesetHolder {

    val tilesetProperty: Property<TilesetResource>

    override var tileset: TilesetResource
}
