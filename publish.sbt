val ElementNexus     = "Element Nexus"     at "http://repo.element.hr/nexus/content/groups/public/"
val ElementReleases  = "Element Releases"  at "http://repo.element.hr/nexus/content/repositories/releases/"
val ElementSnapshots = "Element Snapshots" at "http://repo.element.hr/nexus/content/repositories/snapshots/"

resolvers := Seq(ElementNexus)
externalResolvers := Resolver.withDefaultResolvers(resolvers.value, mavenCentral = false)
publishTo := Some(if (version.value endsWith "SNAPSHOT") ElementSnapshots else ElementReleases)

credentials ++= {
  val creds = Path.userHome / ".config" / "spray-session" / "nexus.config"
  if (creds.exists) Some(Credentials(creds)) else None
}.toSeq
