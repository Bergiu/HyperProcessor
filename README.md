# Problems

- [x] Processor needs more ticks per second (increased from 25 to 100.000)
- [x] Memory needs more cells (increased from 512 to 65536)
- [ ] Processor needs more maximum instructions (currently 1000)

## Processor needs more maximum instructions (currently 1000)

Can be changed in mindustry core:

`/core/src/mindustry/logic/LExecutor.java`:

`public static final int maxInstructions = 1000;`

