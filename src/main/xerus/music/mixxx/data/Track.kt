package xerus.music.mixxx.data

data class Track(
	val id: Long,
	val artist: String?,
	val title: String?,
	val album: String?,
	val year: String?,
	val genre: String?,
	val tracknumber: String?,
	val location: Long,
	val comment: String?,
	val url: String?,
	val duration: Long,
	val bitrate: Long,
	val samplerate: Long,
	val cuepoint: Long,
	val bpm: Double,
	val channels: Long,
	val datetimeAdded: String?,
	val mixxx_deleted: Boolean,
	val played: Long,
	val headerParsed: Long,
	val filetype: String?,
	val replaygain: Double,
	val timesplayed: Long,
	val rating: Long,
	val key: String?,
	val beatsVersion: String?,
	val composer: String?,
	val bpmLock: Long,
	val beatsSubVersion: String?,
	val keysVersion: String?,
	val keysSubVersion: String?,
	val keyId: String?,
	val grouping: String?,
	val albumArtist: String?,
	val coverartSource: Long,
	val coverartType: Long,
	val coverartLocation: String?,
	val coverartHash: Long,
	val replaygainPeak: Double,
	val tracktotal: String?
)