import { BaseEntity } from './../../shared';

export class JobMySuffix implements BaseEntity {
    constructor(
        public id?: string,
        public jobTitle?: string,
        public minSalary?: number,
        public maxSalary?: number,
    ) {
    }
}
